package wildflyswarm.doma.dao;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Annotation;
import org.seasar.doma.AnnotationTarget;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@AnnotateWith(annotations = {
  @Annotation(target = AnnotationTarget.CLASS, type = ApplicationScoped.class),
  @Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Inject.class)})
@Retention(RetentionPolicy.RUNTIME)
public @interface CdiManaged {}
