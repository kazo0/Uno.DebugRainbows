using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at http://go.microsoft.com/fwlink/?LinkId=402352&clcid=0x409

namespace DebugRainbowsSample
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class MainPage : Page
    {


        public bool IsTomato
        {
            get { return (bool)GetValue(IsTomatoProperty); }
            set { SetValue(IsTomatoProperty, value); }
        }

        // Using a DependencyProperty as the backing store for IsTomato.  This enables animation, styling, binding, etc...
        public static readonly DependencyProperty IsTomatoProperty =
            DependencyProperty.Register("IsTomato", typeof(bool), typeof(MainPage), new PropertyMetadata(false));


        public MainPage()
        {
            this.InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            IsTomato = true;
        }
    }
}
