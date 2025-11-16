package Bridgelabz.Exception_Assignment;
import java.time.*;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String msg) { super(msg); }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String msg) { super(msg); }
}

public class Main9 {

    public static void submitExam(String fileName, LocalDateTime time)
            throws LateSubmissionException, InvalidFileFormatException {

        LocalDateTime deadline = LocalDateTime.of(2025, 1, 1, 17, 0);

        if (!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("Submission failed: invalid file format!");

        if (time.isAfter(deadline))
            throw new LateSubmissionException("Submission failed: exam submitted late!");
    }

    public static void main(String[] args) {
        try {
            submitExam("answer.docx", LocalDateTime.now());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

