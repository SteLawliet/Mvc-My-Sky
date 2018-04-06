package sky.mapper;

import java.util.List;

import sky.pojo.DeptEx;

/**
 * Created by Stelawliet on 18/3/25.
 */
public interface DeptExMapper {
    public List<DeptEx> selectDeptEx();
    public List<DeptEx> selectDeptExByNo(Integer integer);

}
