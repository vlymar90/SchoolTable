package sample;



public class Student {

    private int idStudent;
    private String name;
    private String lastName;
    private String group;
    private int total, avgUser, rank, russ, math, history;
    private int literature, chemistry, language, biology, ecology, geography;

    public Student(int idStudent, String name, String lastName,
                   String group, int total, int avgUser, int rank,
                   int russ, int math, int history, int literature,
                   int chemistry, int language, int biology,
                   int ecology, int geography) {
        this.idStudent = idStudent;
        this.name = name;
        this.lastName = lastName;
        this.group = group;
        this.total = total;
        this.avgUser = avgUser;
        this.rank = rank;
        this.russ = russ;
        this.math = math;
        this.history = history;
        this.literature = literature;
        this.chemistry = chemistry;
        this.language = language;
        this.biology = biology;
        this.ecology = ecology;
        this.geography = geography;
    }

    public Student(int idStudent, String name, String lastName, String group, int total, int avgUser, int rank) {
        this.idStudent = idStudent;
        this.name = name;
        this.lastName = lastName;
        this.group = group;
        this.total = total;
        this.avgUser = avgUser;
        this.rank = rank;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public int getTotal() {
        return total;
    }

    public int getAvgUser() {
        return avgUser;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "id: " + idStudent + "\n" +
                "Имя: " + name + "\n" +
                "Фамилия: " + lastName + "\n" +
                "Группа: " + group + "\n" +
                "Средний балл: " + avgUser + "\n" +
                "Всего баллов: " + total + "\n" +
                "Позиция: " + rank + "\n" +
                "========================\n" +
                "Предметы: \n" +
                "Русский язык: " + russ + "\n" +
                "Математика: " + math + "\n" +
                "История: " + history + "\n" +
                "Литература: " + literature + "\n" +
                "Химия: " + chemistry + "\n" +
                "Английский язык: " + language + "\n" +
                "Биология: " + biology + "\n" +
                "Экология: " + ecology + "\n" +
                "География: " + geography;
    }
}
