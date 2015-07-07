# vaadin-test
Ofbiz Vaadin test applciation

## Starting vaadin-test application
1. Clone vaadin-test component into ofbiz_home/hot-deploy directory
2. Run `ant classes-dev` command inside ofbiz_home/hot-deploy/vaadin-test directory
3. Start ofbiz and go to http://localhost:8080/vaadin-test

You can get ofbiz dispatcher and delegator:
```
GenericDelegator delegator = (GenericDelegator) VaadinServlet.getCurrent().getServletContext().getAttribute("delegator");
LocalDispatcher dispatcher = (LocalDispatcher) VaadinServlet.getCurrent().getServletContext().getAttribute("dispatcher");
```

Run `ant classes-dev` command inside ofbiz_home/hot-deploy/vaadin-test directory after code modifications(or set up your IDE custom builder) to apply vaadin application changes without ofbiz restarting
