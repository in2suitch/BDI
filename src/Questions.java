import java.util.HashMap;
import java.util.Map;

public class Questions {
    private final Map<Integer, Answer[]> qNumToAnswer = new HashMap<>();

    public Map<Integer, Answer[]> getQNumToAnswer() {
        return qNumToAnswer;
    }

    public void importQuestions() {

        qNumToAnswer.put(1, new Answer[] {
                new Answer("1 - I do not feel sad."),
                new Answer("2 - I feel sad."),
                new Answer("3 - I am sad all the time and I can't snap out of it."),
                new Answer("4 - I am so sad and unhappy that I can't stand it.") });

        qNumToAnswer.put(2, new Answer[] {
                new Answer("1 - I am not particularly discouraged about the future."),
                new Answer("2 - I feel discouraged about the future."),
                new Answer("3 - I feel I have nothing to look forward to."),
                new Answer("4 - I feel the future is hopeless and that things cannot improve.") });

        qNumToAnswer.put(3, new Answer[] {
                new Answer("1 - I do not feel like a failure."),
                new Answer("2 - I feel I have failed more than the average person."),
                new Answer("3 - As I look back on my life, all I can see is a lot of failures."),
                new Answer("4 - I feel I am a complete failure as a person.") });

        qNumToAnswer.put(4, new Answer[] {
                new Answer("1 - I get as much satisfaction out of things as I used to."),
                new Answer("2 - I don't enjoy things the way I used to."),
                new Answer("3 - I don't get real satisfaction out of anything anymore."),
                new Answer("4 - I am dissatisfied or bored with everything.") });

        qNumToAnswer.put(5, new Answer[] {
                new Answer("1 - I don't feel particularly guilty."),
                new Answer("2 - I feel guilty a good part of the time."),
                new Answer("3 - I feel quite guilty most of the time."),
                new Answer("4 - I feel guilty all of the time.") });

        qNumToAnswer.put(6, new Answer[] {
                new Answer("1 - I don't feel I am being punished."),
                new Answer("2 - I feel I may be punished."),
                new Answer("3 - I expect to be punished."),
                new Answer("4 - I feel I am being punished.") });

        qNumToAnswer.put(7, new Answer[] {
                new Answer("1 - I don't feel disappointed in myself."),
                new Answer("2 - I am disappointed in myself"),
                new Answer("3 - I am disgusted with myself."),
                new Answer("4 - I hate myself.") });

        qNumToAnswer.put(8, new Answer[] {
                new Answer("1 - I don't feel I am any worse than anybody else."),
                new Answer("2 - I am critical of myself for my weaknesses or mistakes."),
                new Answer("3 - I blame myself all the time for my faults."),
                new Answer("4 - I blame myself for everything bad that happens.") });

        qNumToAnswer.put(9, new Answer[] {
                new Answer("1 - I don't have any thoughts of killing myself."),
                new Answer("2 - I have thoughts of killing myself, but I would not carry them out."),
                new Answer("3 - I would like to kill myself."),
                new Answer("4 - I would kill myself if I had the chance") });

        qNumToAnswer.put(10, new Answer[] {
                new Answer("1 - I don't cry any more than usual."),
                new Answer("2 - I cry more now than I used to."),
                new Answer("3 - I cry all the time now."),
                new Answer("4 - I used to be able to cry, but now I can't cry even though I want to.") });

        qNumToAnswer.put(11, new Answer[] {
                new Answer("1 - I am no more irritated by things than I ever was."),
                new Answer("2 - I am slightly more irritated now than usual."),
                new Answer("3 - I am quite annoyed or irritated a good deal of the time."),
                new Answer("4 - I feel irritated all the time.") });

        qNumToAnswer.put(12, new Answer[] {
                new Answer("1 - I have not lost interest in other people."),
                new Answer("2 - I am less interested in other people than I used to be."),
                new Answer("3 - I have lost most of my interest in other people."),
                new Answer("4 - I have lost all of my interest in other people.") });

        qNumToAnswer.put(13, new Answer[] {
                new Answer("1 - I make decisions about as well as I ever could."),
                new Answer("2 - I put off making decisions more than I used to."),
                new Answer("3 - I have greater difficulty in making decisions more than I used to."),
                new Answer("4 - I can't make decisions at all anymore.") });

        qNumToAnswer.put(14, new Answer[] {
                new Answer("1 - I don't feel that I look any worse than I used to."),
                new Answer("2 - I am worried that I am looking old or unattractive."),
                new Answer("3 - I feel there are permanent changes in my appearance that make me look unattractive"),
                new Answer("4 - I believe that I look ugly.") });

        qNumToAnswer.put(15, new Answer[] {
                new Answer("1 - I can work about as well as before."),
                new Answer("2 - It takes an extra effort to get started at doing something."),
                new Answer("3 - I have to push myself very hard to do anything."),
                new Answer("4 - I can't do any work at all.") });

        qNumToAnswer.put(16, new Answer[] {
                new Answer("1 - I can sleep as well as usual."),
                new Answer("2 - I don't sleep as well as I used to."),
                new Answer("3 - I wake up 1-2 hours earlier than usual and find it hard to get back to sleep."),
                new Answer("4 - I wake up several hours earlier than I used to and cannot get back to sleep.") });

        qNumToAnswer.put(17, new Answer[] {
                new Answer("1 - I don't get more tired than usual."),
                new Answer("2 - I get tired more easily than I used to."),
                new Answer("3 - I get tired from doing almost anything."),
                new Answer("4 - I am too tired to do anything.") });

        qNumToAnswer.put(18, new Answer[] {
                new Answer("1 - My appetite is no worse than usual."),
                new Answer("2 - My appetite is not as good as it used to be."),
                new Answer("3 - My appetite is much worse now."),
                new Answer("4 - I have no appetite at all anymore.") });

        qNumToAnswer.put(19, new Answer[] {
                new Answer("1 - I haven't lost much weight, if any, lately."),
                new Answer("2 - I have lost more than 2 kg (5 pounds)."),
                new Answer("3 - I have lost more than 5 kg (10 pounds)."),
                new Answer("4 - I have lost more than 7 kg (15 pounds).") });

        qNumToAnswer.put(20, new Answer[] {
                new Answer("1 - I am no more worried about my health than usual."),
                new Answer("2 - I am worried about physical problems like aches, pains, upset stomach," +
                        " or constipation."),
                new Answer("3 - I am very worried about physical problems and it's hard to think of much else."),
                new Answer("4 - I am so worried about my physical problems that I cannot think of anything else.") });

        qNumToAnswer.put(21, new Answer[] {
                new Answer("1 - I have not noticed any recent change in my interest in sex."),
                new Answer("2 - I am less interested in sex than I used to be."),
                new Answer("3 - I have almost no interest in sex."),
                new Answer("4 - I have lost interest in sex completely.") });
    }
}
