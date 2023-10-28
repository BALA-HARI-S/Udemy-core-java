public class JavaDev extends Worker{
    public static void main(String[] args) {
        JavaDev work = new JavaDev();
        work.work();
        work.hike();
        work.leave();
    }

    public void work(){
        System.out.println("Java projects");
    }

}
