package singh.inthamoussu.fitformula.ui.recovery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecoveryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RecoveryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is RECOVERY fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}