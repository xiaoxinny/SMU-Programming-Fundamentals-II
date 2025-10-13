
public class CheckScoreCtrl {

    private QuizDAO quizDAO;

    public CheckScoreCtrl() {
        quizDAO = new QuizDAO();
    }

    public double calculateDifferenceFromAverage(String studentName, String quizName) {
        Quiz quiz = quizDAO.retrieve(quizName);
        if (quiz == null) {
            throw new IllegalArgumentException("No such quiz.");
        }
        double averageScore = quiz.getAverageScore();
        Student student = quiz.getStudent(studentName);
        if (student == null) {
            throw new IllegalArgumentException("No such student.");
        }
        int score = student.getScore();
        return score - averageScore;
    }
}
