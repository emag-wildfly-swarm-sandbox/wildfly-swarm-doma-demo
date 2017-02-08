package wildflyswarm.doma;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.H2Dialect;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.sql.DataSource;

@ApplicationScoped
public class AppConfig implements Config {

  @Resource
  private DataSource dataSource;

  private Dialect dialect;

  @PostConstruct
  public void init() {
    this.dialect = new H2Dialect();
  }

  @Override
  public DataSource getDataSource() {
    return dataSource;
  }

  @Override
  public Dialect getDialect() {
    return dialect;
  }

}
