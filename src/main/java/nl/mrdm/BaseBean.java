package nl.mrdm;

import javax.inject.Inject;

public abstract class BaseBean {
    @Inject
    Service service;

    public String doit() {
        return service.get();
    }

    public abstract String getName();
}
