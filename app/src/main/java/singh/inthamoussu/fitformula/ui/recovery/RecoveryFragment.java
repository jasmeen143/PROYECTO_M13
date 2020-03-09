package singh.inthamoussu.fitformula.ui.recovery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import singh.inthamoussu.fitformula.R;

public class RecoveryFragment extends Fragment{

    private final String TAG = getClass().getSimpleName();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_recovery, container, false);
        ImageView image = (ImageView) root.findViewById(R.id.imageView);
        image.setImageResource(R.drawable.model001);
        return root;
    }

}