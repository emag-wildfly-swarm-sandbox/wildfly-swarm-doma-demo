package wildflyswarm.doma.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import wildflyswarm.doma.entity.Employee;

import java.util.List;

@Dao
@CdiManaged
public interface EmployeeDao {

  @Select
  List<Employee> selectAll();

  @Select
  Employee selectById(Integer id);

  @Insert
  int insert(Employee employee);

  @Update
  int update(Employee employee);

  @Delete
  int delete(Employee employee);

}
