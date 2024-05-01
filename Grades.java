public class Grades {
    private final int subjectNumber = 0;  //当前学科数量
    private final int maxSubjectNumber = 5;  //目前的最大学科数量
    private final float expansionRate = 1.5f;  //扩容倍数
    private final float overallGradef = 0;  //总成绩
    Subject[] grades = new Subject[this.maxSubjectNumber];  //各学科分数

}

class Subject{
    private String subjectName;  //学科名称
    private float grade;  //学科分数
}
