public class employeeController {

    private employee emp;
    private employeeView empView;

    public employeeController(employee e, employeeView ev) {

        this.emp = e;
        this.empView = ev;
    }

    public void setName(String name) {
        emp.setName(name);
    }

    public void setEmail(String e) {
        emp.setEmail(e);
    }

    public void setId(int id) {
        emp.setID(id);
    }

    public String getName() {
        return emp.getName();
    }

    public String getEmail() {
        return emp.getEmail();
    }

    public int getId() {
        return emp.getId();
    }

    public void View() {
        empView.printEmployeeDetails(emp);
    }

}