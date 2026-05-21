package kr.ac.kopo.menutest1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editAngle;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // EdgeToEdge 관련 코드 절대 넣지 말 것

        setContentView(R.layout.activity_main);

        editAngle = findViewById(R.id.editAngle);
        imageView = findViewById(R.id.imageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.item_rotate) {

            String str = editAngle.getText().toString();

            if (!str.isEmpty()) {
                float angle = Float.parseFloat(str);
                imageView.setRotation(angle);
            }

            return true;
        }

        else if (id == R.id.item_hanra) {

            item.setChecked(true);

            imageView.setImageResource(R.drawable.jeju1);
            imageView.setRotation(0);

            return true;
        }

        else if (id == R.id.item_chuja) {

            item.setChecked(true);

            imageView.setImageResource(R.drawable.jeju2);
            imageView.setRotation(0);

            return true;
        }

        else if (id == R.id.item_beom) {

            item.setChecked(true);

            imageView.setImageResource(R.drawable.jeju3);
            imageView.setRotation(0);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}