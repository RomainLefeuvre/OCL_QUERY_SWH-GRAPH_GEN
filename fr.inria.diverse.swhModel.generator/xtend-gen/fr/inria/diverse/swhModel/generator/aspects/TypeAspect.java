package fr.inria.diverse.swhModel.generator.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.ocl.pivot.Type;

@Aspect(className = Type.class)
@SuppressWarnings("all")
public abstract class TypeAspect extends NamedElementAspect {
}
