package app_01;


import java.util.ArrayList;

public class Snapshot {
    private ArrayList<Integer> dataBackup;

    public Snapshot(ArrayList<Integer> data)
    {
        dataBackup = new ArrayList<Integer>();
        for(int i = 0; i < data.size(); i++)
        {
            dataBackup.add(data.get(i));
        }
    }

    public ArrayList<Integer> restore()
    {
        return dataBackup;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        Snapshot snap = new Snapshot(list);

        list.set(0, 3);
        list = snap.restore();

        System.out.println(list); // Should output [1, 2]

        list.add(4);
        list = snap.restore();

        System.out.println(list); // Should output [1, 2]
    }
}