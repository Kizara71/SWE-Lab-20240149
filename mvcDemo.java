
public class mvcDemo {

    public static void main(String[] args) {
        employee emp = new employee("Test@test.com", "Ahmed Yasser", 101);

        employeeView empView = new employeeView();

        employeeController eC = new employeeController(emp, empView);

        eC.View();

        eC.setName("Not Ahmed Yasser");

        eC.View();

    }
}
