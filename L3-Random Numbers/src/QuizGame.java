import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class QuizGame {
    static double userAnswer, correctAnswer;
    static String displayProblem = "";

   static JPanel panel;
    static JButton createProblem, checkAnswer;
    static JLabel showProblem, resultLabel;
    static JTextField answerInput;
    static JRadioButton addition, subtraction, multiplication, division;
    static ButtonGroup radios = new ButtonGroup();

    public static void main(String[] args) {

        new QuizGame();
        /*int choice =Integer.parseInt(JOptionPane.showInputDialog( " Choose Addition(1) , Subtraction(2), Multiplication(3), Division(4)");

        createProblem(choice);
        getUserAnswer();
        checkAnswer();*/


    }

    public QuizGame(){

        JFrame frame = new JFrame("Quiz Game");
        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel =new JPanel();

        addition = new JRadioButton("Addition");
        subtraction = new JRadioButton("Subtraction");
        multiplication = new JRadioButton("Multiplication");
        division = new JRadioButton("Division");
        createProblem = new JButton("Make A problem");
        showProblem = new JLabel("PLACE HOLDER");
        answerInput = new JTextField(10);
        checkAnswer = new JButton("CHECK ANSWER");
        resultLabel = new JLabel("Answer Result");

        addition.setBounds(100, 25, 200 ,20);
        subtraction.setBounds(100, 50, 200, 20);
        multiplication.setBounds(100, 75, 200, 20);
        division.setBounds(100, 100, 200, 20);

        createProblem.setBounds(50, 125, 200, 25);
        showProblem.setBounds(50, 150, 200, 25);
        answerInput.setBounds(50, 175, 200, 25);
        checkAnswer.setBounds(50, 200, 200, 25);
        resultLabel.setBounds(50, 225, 200, 25);

        addition.setSelected(true);

        createProblem.addActionListener(new NewProblemButton());
        checkAnswer.addActionListener(new checkProblemListener());

        radios.add(addition);
        radios.add(subtraction);
        radios.add(multiplication);
        radios.add(division);


        panel.setLayout(null);
        panel.add(addition);
        panel.add(subtraction);
        panel.add(multiplication);
        panel.add(division);
        panel.add(createProblem);
        panel.add(showProblem);
        panel.add(answerInput);
        panel.add(checkAnswer);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);

    }

    private class NewProblemButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (addition.isSelected()){
                add();
            }
            if (subtraction.isSelected()){
                sub();
            }
            if (multiplication.isSelected()){
                mult();
            }
            if (division.isSelected()){
                div();
            }

            showProblem.setText(displayProblem);
            panel.remove(createProblem);
            panel.updateUI();
        }
    }

    private class checkProblemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            getUserAnswer();
            checkAnswer();
        }
    }
    public static void checkAnswer(){
        if (userAnswer == correctAnswer){
            resultLabel.setText("you are correct");
            panel.add(createProblem);
            panel.updateUI();
        }else{
            resultLabel.setText( "Incorrect, pleas tey again ");
        }
    }

    public static void getUserAnswer(){

        userAnswer = Double.parseDouble(answerInput.getText());

    }

    public static void createProblem(int choice)   {


        if(choice >= 1){;
            if(choice<5){
                if(choice ==1){
                    add();
                }
                if (choice == 2){
                    sub();
                }
                if(choice == 3){
                    mult();
                }
                if(choice==4){
                    div();
                }
            }else {System.out.println("Wrong input, restart program, try again");
                System.exit(0);
            }

        }else{
            System.out.println("Wrong input, restart program, try again");
            System.exit(0);
        }


    }

    public static void add(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 + num2;
        displayProblem = num1 + " + " + num2;
    }

    public static void sub(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 - num2;
        displayProblem = num1 + " - " + num2;
    }

    public static void mult(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 * num2;
        displayProblem = num1 + " X " + num2;
    }

    public static void div(){
        int num1 = random();
        int num2 = random();

        correctAnswer = (num1 / num2);

        correctAnswer = Math.round(correctAnswer * 100.0)/100.0;

        displayProblem = num1 + " / " + num2;
    }
    //HELPER METHOD
    public static int random() {
        Random random = new Random();
        return random.nextInt(20)+1;
    }

    public static double input(String message){
      return Double.parseDouble(JOptionPane.showInputDialog(message));
    }

}
