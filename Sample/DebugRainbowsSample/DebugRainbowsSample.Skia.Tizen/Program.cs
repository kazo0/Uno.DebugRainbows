using Tizen.Applications;
using Uno.UI.Runtime.Skia;

namespace DebugRainbowsSample.Skia.Tizen
{
    class Program
    {
        static void Main(string[] args)
        {
            var host = new TizenHost(() => new DebugRainbowsSample.App(), args);
            host.Run();
        }
    }
}
