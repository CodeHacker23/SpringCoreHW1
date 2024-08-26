import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        ctx.register(); 2 вариант, 1 варик это добавить в парметры ctx
//        ctx.refresh(); 2 вариант
         Home home = ctx.getBean(Home.class);
        System.out.println("Home id: " + home.getId());




    }
}
