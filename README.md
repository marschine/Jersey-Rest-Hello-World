# Jersey-Rest-Hello-World

Used this
http://www.codingpedia.org/ama/restful-web-services-example-in-java-with-jersey-spring-and-mybatis/
and this
http://www.mkyong.com/webservices/jax-rs/jersey-spring-integration-example/
Tutorial.

Worked on remote Tomcat 7 - local Tomcat8

# How it works:

web.xml:
		<init-param>
			<param-name>javax.ws.rs.Application</param-name>
			<param-value>de.marrrschine.draftparser.draftparser_backend.MyApplication</param-value>
		</init-param>
defines which the ResourceConfig which loads 
	public MyApplication() {
		register(RequestContextFilter.class);
		register(PaymentService.class);
	}
a request filter and your Jersey Class

also in the web.xml
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>/WEB-INF/applicationContext.xml</param-value>
	</context-param>

	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
	
to load the springt context and define the application context where every bean has to be defined:

	<context:component-scan
		base-package="de.marrrschine.draftparser.draftparser_backend" />

	<bean id="TransactionBo"
		class="de.marrrschine.draftparser.draftparser_backend.TransactionBoImpl" />

since the rest class is loaded and the beans are defined you can inject them easily via
	@Autowired
	TransactionBo transactionBo;
in your jersey classes
