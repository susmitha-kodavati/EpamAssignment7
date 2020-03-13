package Design.DesignPatterns;

public class EagerInitializedSingleton {
private static final EagerInitializedSingleton i = new EagerInitializedSingleton() ;
EagerInitializedSingleton() {}
public EagerInitializedSingleton getInstance() {
return i ;
}
}
