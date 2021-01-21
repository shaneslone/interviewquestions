package urlify;

public class Main {
    public static char[] urlify(char[] url, int length)
    {
        int p1 = url.length - 1;
        for(int i = length -1; i >= 0; i--)
        {
            if(url[i] != ' ')
            {
                url[p1] = url[i];
                p1--;
            }
            else
            {
                url[p1] = '0';
                p1--;
                url[p1] = '2';
                p1--;
                url[p1] = '%';
                p1--;
            }
        }
        return url;
    }

    public static void main(String[] args)
    {
        char [] test = {'T', 'e', 's', 't', ' ', 'O', 'n', 'e', ' ', ' '};
        char [] test2 = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
        System.out.println(urlify(test, 8));
        System.out.println(urlify(test2, 13));
    }
}
