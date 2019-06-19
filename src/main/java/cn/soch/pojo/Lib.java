package cn.soch.pojo;

public class Lib {
    private int id;
    private String question;
    private String answer;
    private int uId;
    private int attachId;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getAttachId() {
        return attachId;
    }

    public void setAttachId(int attachId) {
        this.attachId = attachId;
    }

    @Override
    public String toString() {
        return "Lib{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", uId=" + uId +
                ", attachId=" + attachId +
                '}';
    }
}
