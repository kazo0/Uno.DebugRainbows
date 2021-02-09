package crc644139272d07a52397;


public class NetworkCallbackListener
	extends android.net.ConnectivityManager.NetworkCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAvailable:(Landroid/net/Network;)V:GetOnAvailable_Landroid_net_Network_Handler\n" +
			"n_onCapabilitiesChanged:(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V:GetOnCapabilitiesChanged_Landroid_net_Network_Landroid_net_NetworkCapabilities_Handler\n" +
			"n_onLinkPropertiesChanged:(Landroid/net/Network;Landroid/net/LinkProperties;)V:GetOnLinkPropertiesChanged_Landroid_net_Network_Landroid_net_LinkProperties_Handler\n" +
			"n_onLosing:(Landroid/net/Network;I)V:GetOnLosing_Landroid_net_Network_IHandler\n" +
			"n_onLost:(Landroid/net/Network;)V:GetOnLost_Landroid_net_Network_Handler\n" +
			"n_onUnavailable:()V:GetOnUnavailableHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.Networking.Connectivity.Internal.NetworkCallbackListener, Uno", NetworkCallbackListener.class, __md_methods);
	}


	public NetworkCallbackListener ()
	{
		super ();
		if (getClass () == NetworkCallbackListener.class)
			mono.android.TypeManager.Activate ("Windows.Networking.Connectivity.Internal.NetworkCallbackListener, Uno", "", this, new java.lang.Object[] {  });
	}


	public void onAvailable (android.net.Network p0)
	{
		n_onAvailable (p0);
	}

	private native void n_onAvailable (android.net.Network p0);


	public void onCapabilitiesChanged (android.net.Network p0, android.net.NetworkCapabilities p1)
	{
		n_onCapabilitiesChanged (p0, p1);
	}

	private native void n_onCapabilitiesChanged (android.net.Network p0, android.net.NetworkCapabilities p1);


	public void onLinkPropertiesChanged (android.net.Network p0, android.net.LinkProperties p1)
	{
		n_onLinkPropertiesChanged (p0, p1);
	}

	private native void n_onLinkPropertiesChanged (android.net.Network p0, android.net.LinkProperties p1);


	public void onLosing (android.net.Network p0, int p1)
	{
		n_onLosing (p0, p1);
	}

	private native void n_onLosing (android.net.Network p0, int p1);


	public void onLost (android.net.Network p0)
	{
		n_onLost (p0);
	}

	private native void n_onLost (android.net.Network p0);


	public void onUnavailable ()
	{
		n_onUnavailable ();
	}

	private native void n_onUnavailable ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
