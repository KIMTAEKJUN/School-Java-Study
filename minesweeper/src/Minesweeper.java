import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Minesweeper extends JFrame {
    private static final int MINE = 99;
    private int gridSize;
    private Cell[][] cells;

    private JButton reset;
    // private JButton giveup;

    public Minesweeper(int gridSize) {
        this.gridSize = gridSize;
        cells = new Cell[gridSize][gridSize];

        setTitle("Minesweeper");
        setSize(500, 500);
        setLayout(new BorderLayout());

        initMenu();
        initBoard();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private final ActionListener actionListener = actionEvent -> {
        Object source = actionEvent.getSource();
        if (source == reset) {
            createMines();
        } else {
            processCell((Cell) source);
        }
    };

    private class Cell extends JButton {
        private int row;
        private int col;
        private int value;

        public Cell(int row, int col, ActionListener actionListener) {
            this.row = row;
            this.col = col;
            addActionListener(actionListener);
            setText("");
        }

        int getValue() {
            return value;
        }

        void setValue(int value) {
            this.value = value;
        }

        boolean isMine() {
            return value == MINE;
        }

        void reset() {
            setValue(0);
            setEnabled(true);
            setText("");
        }

        void reveal() {
            setEnabled(false);
            setText(isMine() ? "X" : String.valueOf(value));
        }

        void updateNeighbourCount() {
            for (int rowIndex = -1; rowIndex <= 1; rowIndex++) {
                for (int colIndex = -1; colIndex <= 1; colIndex++) {
                    if (rowIndex == 0 && colIndex == 0) {
                        continue;
                    }
                    int rowValue = row + rowIndex;
                    int colValue = col + colIndex;

                    if (rowValue < 0 || rowValue >= gridSize || colValue < 0 || colValue >= gridSize) {
                        continue;
                    }

                    if (cells[rowValue][colValue].isMine()) {
                        value++;
                    }
                }
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Cell cell = (Cell) obj;
            return row == cell.row && col == cell.col;
        }
    }


    private void initMenu() {
        JPanel buttonPanel = new JPanel();

        reset = new JButton("초기화");
        reset.addActionListener(actionListener);

        buttonPanel.add(reset);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void initBoard() {
        JPanel board = new JPanel();
        board.setLayout(new GridLayout(gridSize, gridSize));

        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                cells[row][col] = new Cell(row, col, actionListener);
                board.add(cells[row][col]);
            }
        }
        createMines();
        add(board, BorderLayout.CENTER);
    }

    private void resetCells() {
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                cells[row][col].reset();
            }
        }
    }

    private void createMines() {
        resetCells();

        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                if (Math.random() < 0.1) cells[row][col].setValue(MINE);
            }
        }
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                if (!cells[row][col].isMine()) {
                    cells[row][col].updateNeighbourCount();
                }
            }
        }
    }

    private void processCell(Cell cell) {
        if (cell.isMine()) {
            cell.setForeground(Color.RED);
            cell.reveal();
            display("지뢰를 클릭하였음!");
            return;
        } else cell.reveal();
        checkWin();
    }

    private void display(String message) {
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                if (!cells[row][col].isEnabled()) {
                    cells[row][col].reveal();
                }
            }
        }

        JOptionPane.showMessageDialog(this, message, "게임종료", JOptionPane.ERROR_MESSAGE);

        createMines();
    }

    private void checkWin() {
        boolean win = true;
        for (Cell[] cellRow : cells) {
            for (Cell cell : cellRow) {
                if (!cell.isMine() && cell.isEnabled()) {
                    win = false;
                }
            }
        }

        if (win) {
            JOptionPane.showMessageDialog(this, "성공!!", "축하합니다.", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Minesweeper(7);
    }
}