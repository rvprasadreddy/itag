package solutions.s4y.itag;


import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class NoBLEFragment extends Fragment {


    public NoBLEFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_no_ble, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        ITagApplication.faNoBluetooth();
    }
}
