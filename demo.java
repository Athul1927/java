class student
{
    int id;
    String name;
    float mark;

    void get(int id1, String n, float m)
    {
        id = id1;
        name = n;
        mark = m;
    }

    void show()
    {
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
        System.out.println("my mark is " + mark);
    }
}

class demo
{
    public static void main(String args[])
    {
        student s1 = new student();
        s1.get(1, "Anu", 21);
        s1.show();
    }
}