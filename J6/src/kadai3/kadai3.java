package kadai3;

public class kadai3
{
    public static void main(String[] args)
    {
        Facility[] fac={new Zoo("ズーラシア"), new Aquarium("エノスイ"), new Zoo("野毛山動物園"), new Zoo("金沢動物園"), new Aquarium("カワスイ"), new Aquarium("シーパラ")};
        for(int i = 0; i < fac.length; i++)
        {
            if(fac[i] instanceof Zoo)
            {
                fac[i].print();
            }
        }
        for(int i = 0; i < fac.length; i++)
        {
            if(fac[i] instanceof Aquarium)
            {
                fac[i].print();
            }
        }
    }
}
