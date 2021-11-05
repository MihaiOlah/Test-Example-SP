public class OSFactory {
    public OSFactory()
    {

    }

    public OperatingSystem create(OSTypes osType)
    {
        if (osType == null)
        {
            return null;
        }

        if (osType.equals(OSTypes.Android))
        {
            return new Android();
        }
        else if (osType.equals(OSTypes.WP))
        {
            return new WindowsPhone();
        }
        else if (osType.equals(OSTypes.IOS))
        {
            return new IOS();
        }
        else
        {
            return null;
        }
    }
}
