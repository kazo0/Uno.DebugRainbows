package crc64a5a37c43dff01024;


public class TextBox_TextBoxInputConnection
	extends android.view.inputmethod.BaseInputConnection
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getEditable:()Landroid/text/Editable;:GetGetEditableHandler\n" +
			"n_beginBatchEdit:()Z:GetBeginBatchEditHandler\n" +
			"n_endBatchEdit:()Z:GetEndBatchEditHandler\n" +
			"n_closeConnection:()V:GetCloseConnectionHandler\n" +
			"n_clearMetaKeyStates:(I)Z:GetClearMetaKeyStates_IHandler\n" +
			"n_commitCompletion:(Landroid/view/inputmethod/CompletionInfo;)Z:GetCommitCompletion_Landroid_view_inputmethod_CompletionInfo_Handler\n" +
			"n_commitCorrection:(Landroid/view/inputmethod/CorrectionInfo;)Z:GetCommitCorrection_Landroid_view_inputmethod_CorrectionInfo_Handler\n" +
			"n_performEditorAction:(I)Z:GetPerformEditorAction_IHandler\n" +
			"n_performContextMenuAction:(I)Z:GetPerformContextMenuAction_IHandler\n" +
			"n_getExtractedText:(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;:GetGetExtractedText_Landroid_view_inputmethod_ExtractedTextRequest_IHandler\n" +
			"n_performPrivateCommand:(Ljava/lang/String;Landroid/os/Bundle;)Z:GetPerformPrivateCommand_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_requestCursorUpdates:(I)Z:GetRequestCursorUpdates_IHandler\n" +
			"n_commitText:(Ljava/lang/CharSequence;I)Z:GetCommitText_Ljava_lang_CharSequence_IHandler\n" +
			"n_setComposingText:(Ljava/lang/CharSequence;I)Z:GetSetComposingText_Ljava_lang_CharSequence_IHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.TextBox+TextBoxInputConnection, Uno.UI", TextBox_TextBoxInputConnection.class, __md_methods);
	}


	public TextBox_TextBoxInputConnection (android.view.View p0, boolean p1)
	{
		super (p0, p1);
		if (getClass () == TextBox_TextBoxInputConnection.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.TextBox+TextBoxInputConnection, Uno.UI", "Android.Views.View, Mono.Android:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public android.text.Editable getEditable ()
	{
		return n_getEditable ();
	}

	private native android.text.Editable n_getEditable ();


	public boolean beginBatchEdit ()
	{
		return n_beginBatchEdit ();
	}

	private native boolean n_beginBatchEdit ();


	public boolean endBatchEdit ()
	{
		return n_endBatchEdit ();
	}

	private native boolean n_endBatchEdit ();


	public void closeConnection ()
	{
		n_closeConnection ();
	}

	private native void n_closeConnection ();


	public boolean clearMetaKeyStates (int p0)
	{
		return n_clearMetaKeyStates (p0);
	}

	private native boolean n_clearMetaKeyStates (int p0);


	public boolean commitCompletion (android.view.inputmethod.CompletionInfo p0)
	{
		return n_commitCompletion (p0);
	}

	private native boolean n_commitCompletion (android.view.inputmethod.CompletionInfo p0);


	public boolean commitCorrection (android.view.inputmethod.CorrectionInfo p0)
	{
		return n_commitCorrection (p0);
	}

	private native boolean n_commitCorrection (android.view.inputmethod.CorrectionInfo p0);


	public boolean performEditorAction (int p0)
	{
		return n_performEditorAction (p0);
	}

	private native boolean n_performEditorAction (int p0);


	public boolean performContextMenuAction (int p0)
	{
		return n_performContextMenuAction (p0);
	}

	private native boolean n_performContextMenuAction (int p0);


	public android.view.inputmethod.ExtractedText getExtractedText (android.view.inputmethod.ExtractedTextRequest p0, int p1)
	{
		return n_getExtractedText (p0, p1);
	}

	private native android.view.inputmethod.ExtractedText n_getExtractedText (android.view.inputmethod.ExtractedTextRequest p0, int p1);


	public boolean performPrivateCommand (java.lang.String p0, android.os.Bundle p1)
	{
		return n_performPrivateCommand (p0, p1);
	}

	private native boolean n_performPrivateCommand (java.lang.String p0, android.os.Bundle p1);


	public boolean requestCursorUpdates (int p0)
	{
		return n_requestCursorUpdates (p0);
	}

	private native boolean n_requestCursorUpdates (int p0);


	public boolean commitText (java.lang.CharSequence p0, int p1)
	{
		return n_commitText (p0, p1);
	}

	private native boolean n_commitText (java.lang.CharSequence p0, int p1);


	public boolean setComposingText (java.lang.CharSequence p0, int p1)
	{
		return n_setComposingText (p0, p1);
	}

	private native boolean n_setComposingText (java.lang.CharSequence p0, int p1);

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
