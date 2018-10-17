package nl.friesepoort.rocdrone;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Gallerij extends AppCompatActivity {


    ImageView tvOpenCamera;
    ImageView ivPic;

    private final int CAMERA_RESULT = 101;
// Kijkt of de permissions voor de camera geldig zijn of nog niet verstreken
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallerij);
        tvOpenCamera = (ImageView) findViewById(R.id.tvOpenCamera);
        ivPic = (ImageView) findViewById(R.id.ivPic);

            tvOpenCamera.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.M)
                @Override
                public void onClick(View v) {
                    if(ContextCompat.checkSelfPermission(Gallerij.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED){
                        dispatchTakenPictureIntent();
                    }
                    else{
                        if(shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)){
                            Toast.makeText(getApplicationContext(), "Permission Needed.", Toast.LENGTH_LONG).show();
                        }
                        requestPermissions(new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, CAMERA_RESULT);
                    }
                }
            });
        }
//Neemt de foto
        private void dispatchTakenPictureIntent(){
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if(intent.resolveActivity(getPackageManager()) != null){
                startActivityForResult(intent, CAMERA_RESULT);
            }
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if(resultCode == RESULT_OK){
                if(requestCode == CAMERA_RESULT){
                    Bundle extras = data.getExtras();
                    Bitmap bitmap = (Bitmap) extras.get("data");
                    ivPic.setImageBitmap(bitmap);
                }
            }
        }

        @Override
        public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
            if(requestCode == CAMERA_RESULT){
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED){
                    dispatchTakenPictureIntent();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Permission Needed.", Toast.LENGTH_LONG).show();
                }
            }
            else {
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            }
        }
    }
//}

