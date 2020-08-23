package cc.oltremare.querydatawithsql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cc.oltremare.querydatawithsql.dataobject.CacheDO;

/**
 * <p>缓存实体的MyBatis Plus映射操作类,由于这里的Demo没有业务需求和其他复杂逻辑,所以后面的代码直接使用Mapper进行数据库操作</p>
 * @author Oltremare
 * @time 2020/08/17
 */
public interface CacheMapper extends BaseMapper<CacheDO> {
}
