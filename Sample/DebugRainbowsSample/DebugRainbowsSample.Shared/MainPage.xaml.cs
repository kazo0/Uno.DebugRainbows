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


        public int DebugHorizontalItemSize
        {
            get { return (int)GetValue(DebugHorizontalItemSizeProperty); }
            set { SetValue(DebugHorizontalItemSizeProperty, value); }
        }

        // Using a DependencyProperty as the backing store for DebugHorizontalItemSize.  This enables animation, styling, binding, etc...
        public static readonly DependencyProperty DebugHorizontalItemSizeProperty =
            DependencyProperty.Register("DebugHorizontalItemSize", typeof(int), typeof(MainPage), new PropertyMetadata(10));




        public int DebugMajorGridLineInterval
        {
            get { return (int)GetValue(DebugMajorGridLineIntervalProperty); }
            set { SetValue(DebugMajorGridLineIntervalProperty, value); }
        }

        // Using a DependencyProperty as the backing store for DebugMajorGridLineInterval.  This enables animation, styling, binding, etc...
        public static readonly DependencyProperty DebugMajorGridLineIntervalProperty =
            DependencyProperty.Register("DebugMajorGridLineInterval", typeof(int), typeof(MainPage), new PropertyMetadata(3));



        public MainPage()
        {
            this.InitializeComponent();
        }
    }
}
