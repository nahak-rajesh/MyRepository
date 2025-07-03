package OOPS_3.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Main TicTacToe GUI class
public class TicTacToeUI extends JFrame implements ActionListener {

    private JButton[][] buttons = new JButton[3][3];
    private char currentPlayer;
    private Board board;
    private Player player1, player2;
    private JLabel statusLabel;

    public TicTacToeUI() {
        setTitle("Tic Tac Toe");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize players
        initializePlayers();

        board = new Board(player1.getSymbol(), player2.getSymbol());
        currentPlayer = player1.getSymbol();

        // Board Panel
        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(3, 3));
        Font font = new Font("Arial", Font.BOLD, 60);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(font);
                buttons[i][j].addActionListener(this);
                boardPanel.add(buttons[i][j]);
            }
        }

        // Status label
        statusLabel = new JLabel("Turn: " + getCurrentPlayerName(), SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        add(statusLabel, BorderLayout.NORTH);
        add(boardPanel, BorderLayout.CENTER);
    }

    private void initializePlayers() {
        String name1 = JOptionPane.showInputDialog(this, "Enter Player 1 Name:");
        char symbol1 = JOptionPane.showInputDialog(this, "Enter Player 1 Symbol:").charAt(0);
        player1 = new Player(name1, symbol1);

        String name2 = JOptionPane.showInputDialog(this, "Enter Player 2 Name:");
        char symbol2 = JOptionPane.showInputDialog(this, "Enter Player 2 Symbol:").charAt(0);
        while (symbol2 == symbol1) {
            symbol2 = JOptionPane.showInputDialog(this, "Symbol already taken! Enter another symbol:").charAt(0);
        }
        player2 = new Player(name2, symbol2);
    }

    private String getCurrentPlayerName() {
        return (currentPlayer == player1.getSymbol()) ? player1.getName() : player2.getName();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedBtn = (JButton) e.getSource();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (clickedBtn == buttons[i][j]) {
                    if (buttons[i][j].getText().equals("")) {
                        buttons[i][j].setText(String.valueOf(currentPlayer));
                        int status = board.move(currentPlayer, i, j);
                        handleGameStatus(status);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid Move!");
                    }
                }
            }
        }
    }

    private void handleGameStatus(int status) {
        if (status == Board.PLAYER_1_WINS) {
            JOptionPane.showMessageDialog(this, "Player 1 (" + player1.getName() + ") Wins!");
            disableBoard();
        } else if (status == Board.PLAYER_2_WINS) {
            JOptionPane.showMessageDialog(this, "Player 2 (" + player2.getName() + ") Wins!");
            disableBoard();
        } else if (status == Board.DRAW) {
            JOptionPane.showMessageDialog(this, "Game Draw!");
            disableBoard();
        } else {
            // Continue playing
            currentPlayer = (currentPlayer == player1.getSymbol()) ? player2.getSymbol() : player1.getSymbol();
            statusLabel.setText("Turn: " + getCurrentPlayerName());
        }
    }

    private void disableBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicTacToeUI game = new TicTacToeUI();
            game.setVisible(true);
        });
    }
}