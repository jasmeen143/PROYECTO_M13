package singh.inthamoussu.fitformula.ui.recovery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import singh.inthamoussu.fitformula.R;

public class RecoveryFragment extends Fragment{

    private final String TAG = getClass().getSimpleName();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_recovery, container, false);
        ImageView image = (ImageView) root.findViewById(R.id.imageView);
        image.setImageResource(R.drawable.model001);

        root.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_UP){
                    Toast.makeText(getActivity().getApplicationContext(),"X: "+event.getX()+ " Y: "+event.getY(),Toast.LENGTH_SHORT).show();
                    System.out.println("X:"+event.getX()+ "\tY:"+event.getY());
                }
                return true;
            }
        });

        return root;
    }


}