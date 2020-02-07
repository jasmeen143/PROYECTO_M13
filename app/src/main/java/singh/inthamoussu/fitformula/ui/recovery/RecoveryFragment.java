package singh.inthamoussu.fitformula.ui.recovery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import at.lukle.clickableareasimage.OnClickableAreaClickedListener;
import singh.inthamoussu.fitformula.R;

public class RecoveryFragment extends Fragment implements OnClickableAreaClickedListener {

    private final String TAG = getClass().getSimpleName();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_recovery, container, false);
        ImageView image = (ImageView) root.findViewById(R.id.imageView);
        image.setImageResource(R.drawable.model001);
        return root;
    }

    @Override
    public void onClickableAreaTouched(Object o) {

    }
}