package HelloApp;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Hello".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at 8 Feb, 2016 11:26:57 PM
 */

public class HelloPOATie
	extends HelloPOA
{
	private HelloOperations _delegate;

	private POA _poa;
	public HelloPOATie(HelloOperations delegate)
	{
		_delegate = delegate;
	}
	public HelloPOATie(HelloOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HelloApp.Hello _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		HelloApp.Hello __r = HelloApp.HelloHelper.narrow(__o);
		return __r;
	}
	public HelloApp.Hello _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		HelloApp.Hello __r = HelloApp.HelloHelper.narrow(__o);
		return __r;
	}
	public HelloOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HelloOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public java.lang.String sayHello()
	{
		return _delegate.sayHello();
	}

	public void shutdown()
	{
_delegate.shutdown();
	}

}
