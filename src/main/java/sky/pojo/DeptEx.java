package sky.pojo;

import java.util.List;

/**
 * Created by Stelawliet on 18/3/25.
 */
public class DeptEx extends Dept {
    private Emp emp;
    private List<Emp> empList;

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
