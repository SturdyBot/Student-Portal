package com.example.ngitstudentportal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import org.apache.commons.io.FilenameUtils;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphImageButton;

public class ai_cse_fifthsem extends AppCompatActivity {

    NeumorphButton button1;
    NeumorphImageButton upload_1;
    TextView upload_status_1;
    Uri pdfURI_1;
    //
    //
    NeumorphButton button2;
    NeumorphImageButton upload_2;
    TextView upload_status_2;
    Uri pdfURI_2;
    //
    //
    NeumorphButton button3;
    NeumorphImageButton upload_3;
    TextView upload_status_3;
    Uri pdfURI_3;
    //
    //
    NeumorphButton button4;
    NeumorphImageButton upload_4;
    TextView upload_status_4;
    Uri pdfURI_4;
    //
    //
    NeumorphButton button5;
    NeumorphImageButton upload_5;
    TextView upload_status_5;
    Uri pdfURI_5;
    //
    //
    NeumorphButton qp_button1;
    NeumorphImageButton qp_upload_1;
    TextView qp_status_1;
    Uri qp_pdfURI_1;
    //
    //
    NeumorphButton syllabus_button_1;
    NeumorphImageButton syllabus_upload_1;
    TextView syllabus_status_1;
    Uri syllabus_pdfURI_1;
    //
    //
    NeumorphButton miscellaneous_button_1;
    NeumorphImageButton miscellaneous_upload_1;
    TextView miscellaneous_status_1;
    Uri miscellaneous_pdfURI_1;
    //
    //
    FirebaseStorage storage;
    FirebaseDatabase database;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_cse_fifthsem);

        storage = FirebaseStorage.getInstance();
        database = FirebaseDatabase.getInstance();
        //
        //
        button1 = findViewById(R.id.button1);
        upload_1 = findViewById(R.id.upload_1);
        upload_status_1 = findViewById(R.id.upload_status_1);
        //
        //
        button2 = findViewById(R.id.button2);
        upload_2 = findViewById(R.id.upload_2);
        upload_status_2 = findViewById(R.id.upload_status_2);
        //
        //
        button3 = findViewById(R.id.button3);
        upload_3 = findViewById(R.id.upload_3);
        upload_status_3 = findViewById(R.id.upload_status_3);
        //
        //
        button4 = findViewById(R.id.button4);
        upload_4 = findViewById(R.id.upload_4);
        upload_status_4 = findViewById(R.id.upload_status_4);
        //
        //
        button5 = findViewById(R.id.button5);
        upload_5 = findViewById(R.id.upload_5);
        upload_status_5 = findViewById(R.id.upload_status_5);
        //
        //
        qp_button1= findViewById(R.id.qp_button1);
        qp_upload_1 = findViewById(R.id.qp_upload_1);
        qp_status_1 = findViewById(R.id.qp_status_1);
        //
        //
        syllabus_button_1 = findViewById(R.id.syllabus_button_1);
        syllabus_upload_1 = findViewById(R.id.syllabus_upload_1);
        syllabus_status_1 = findViewById(R.id.syllabus_status_1);
        //
        //
        miscellaneous_button_1 = findViewById(R.id.miscellaneous_button_1);
        miscellaneous_upload_1 = findViewById(R.id.miscellaneous_upload_1);
        miscellaneous_status_1 = findViewById(R.id.miscellaneous_status_1);
        //
        //
        // ------ Selecting Files using the Choose File Button ------
        //
        //
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(ai_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF();
                } else {
                    ActivityCompat.requestPermissions(ai_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 9);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(ai_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_1();
                } else {
                    ActivityCompat.requestPermissions(ai_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 10);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(ai_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_2();
                } else {
                    ActivityCompat.requestPermissions(ai_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 11);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(ai_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_3();
                } else {
                    ActivityCompat.requestPermissions(ai_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 12);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(ai_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_4();
                } else {
                    ActivityCompat.requestPermissions(ai_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 13);
                }
            }
        });

        qp_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(ai_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    qp_selectPDF_1();
                } else {
                    ActivityCompat.requestPermissions(ai_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 250);
                }
            }
        });

        syllabus_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(ai_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    syllabus_selectPDF_1();
                } else {
                    ActivityCompat.requestPermissions(ai_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 350);
                }
            }
        });

        miscellaneous_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(ai_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    miscellaneous_selectPDF_1();
                } else {
                    ActivityCompat.requestPermissions(ai_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 450);
                }
            }
        });
        //
        //
        //------ Uploading Files using the Upload image button ------
        //
        //
        upload_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_1 != null) {
                    uploadFile(pdfURI_1);
                } else {
                    Toast.makeText(ai_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_2 != null) {
                    uploadFile_1(pdfURI_2);
                } else {
                    Toast.makeText(ai_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_3 != null) {
                    uploadFile_2(pdfURI_3);
                } else {
                    Toast.makeText(ai_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_4 != null) {
                    uploadFile_3(pdfURI_4);
                } else {
                    Toast.makeText(ai_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_5 != null) {
                    uploadFile_4(pdfURI_5);
                } else {
                    Toast.makeText(ai_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        qp_upload_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (qp_pdfURI_1 != null) {
                    qp_uploadFile_1(qp_pdfURI_1);
                } else {
                    Toast.makeText(ai_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        syllabus_upload_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (syllabus_pdfURI_1 != null) {
                    syllabus_uploadFile_1(syllabus_pdfURI_1);
                } else {
                    Toast.makeText(ai_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        miscellaneous_upload_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (miscellaneous_pdfURI_1 != null) {
                    miscellaneous_uploadFile_1(miscellaneous_pdfURI_1);
                } else {
                    Toast.makeText(ai_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

        //
        // - UNIT:1
        //

    private void uploadFile(Uri pdfURI_1) {

        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName= (String) upload_status_1.getText();
        StorageReference storageReference = storage.getReference("AI_Unit_1");
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("AI_Unit_1");
        storageReference.child(fileName).putFile(pdfURI_1)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        Task<Uri> firebase_url = taskSnapshot.getStorage().getDownloadUrl();
                        firebase_url.addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                String url = uri.toString();
                                Log.e("TAG:", "the url is: " + url);
                                reference.child(fileName).setValue(url);
                            }
                        }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                            @Override
                            public void onComplete(@NonNull Task<Uri> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();
                                    Toast.makeText(ai_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(ai_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(ai_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                int currentProgress = (int) (100 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
                progressDialog.setProgress(currentProgress);
            }
        });
    }


    //
    // - UNIT:2
    //

    private void uploadFile_1(Uri pdfURI_2) {

        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName= (String) upload_status_2.getText();
        StorageReference storageReference = storage.getReference("AI_Unit_2");
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("AI_Unit_2");
        storageReference.child(fileName).putFile(pdfURI_2)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        Task<Uri> firebase_url = taskSnapshot.getStorage().getDownloadUrl();
                        firebase_url.addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                String url = uri.toString();
                                Log.e("TAG:", "the url is: " + url);
                                reference.child(fileName).setValue(url);
                            }
                        }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                            @Override
                            public void onComplete(@NonNull Task<Uri> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();
                                    Toast.makeText(ai_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(ai_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(ai_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                int currentProgress = (int) (100 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
                progressDialog.setProgress(currentProgress);
            }
        });
    }

    //
    // - UNIT: 3
    //

    private void uploadFile_2(Uri pdfURI_3) {

        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();

        String fileName= (String) upload_status_3.getText();
        StorageReference storageReference = storage.getReference("AI_Unit_3");
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("AI_Unit_3");
        storageReference.child(fileName).putFile(pdfURI_3)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        Task<Uri> firebase_url = taskSnapshot.getStorage().getDownloadUrl();
                        firebase_url.addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                String url = uri.toString();
                                Log.e("TAG:", "the url is: " + url);
                                reference.child(fileName).setValue(url);
                            }
                        }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                            @Override
                            public void onComplete(@NonNull Task<Uri> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();
                                    Toast.makeText(ai_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(ai_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(ai_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                int currentProgress = (int) (100 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
                progressDialog.setProgress(currentProgress);
            }
        });
    }

    //
    // - UNIT:4
    //

    private void uploadFile_3(Uri pdfURI_4) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();

        String fileName= (String) upload_status_4.getText();
        StorageReference storageReference = storage.getReference("AI_Unit_4");
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("AI_Unit_4");
        storageReference.child(fileName).putFile(pdfURI_4)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        Task<Uri> firebase_url = taskSnapshot.getStorage().getDownloadUrl();
                        firebase_url.addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                String url = uri.toString();
                                Log.e("TAG:", "the url is: " + url);
                                reference.child(fileName).setValue(url);
                            }
                        }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                            @Override
                            public void onComplete(@NonNull Task<Uri> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();
                                    Toast.makeText(ai_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(ai_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(ai_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                int currentProgress = (int) (100 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
                progressDialog.setProgress(currentProgress);
            }
        });
    }

    //
    // - UNIT:5
    //

    private void uploadFile_4(Uri pdfURI_5) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();

        String fileName= (String) upload_status_5.getText();
        StorageReference storageReference = storage.getReference("AI_Unit_5");
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("AI_Unit_5");
        storageReference.child(fileName).putFile(pdfURI_5)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        Task<Uri> firebase_url = taskSnapshot.getStorage().getDownloadUrl();
                        firebase_url.addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                String url = uri.toString();
                                Log.e("TAG:", "the url is: " + url);
                                reference.child(fileName).setValue(url);
                            }
                        }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                            @Override
                            public void onComplete(@NonNull Task<Uri> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();
                                    Toast.makeText(ai_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(ai_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(ai_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                int currentProgress = (int) (100 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
                progressDialog.setProgress(currentProgress);
            }
        });
    }

    //
    // - AI Question Paper -
    //

    private void qp_uploadFile_1(Uri qp_pdfURI_1) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("AI_QP").child(fileName).putFile(qp_pdfURI_1)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        String url = taskSnapshot.getMetadata().getReference().getDownloadUrl().toString();
                        DatabaseReference reference = database.getReference();
                        reference.child(fileName).setValue(url).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();
                                    Toast.makeText(ai_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(ai_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(ai_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {

                int currentProgress = (int) (100 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
                progressDialog.setProgress(currentProgress);
            }
        });

    }

    //
    // - AI Syllabus -
    //

    private void syllabus_uploadFile_1(Uri syllabus_pdfURI_1) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("AI_Syllabus").child(fileName).putFile(syllabus_pdfURI_1)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        String url = taskSnapshot.getMetadata().getReference().getDownloadUrl().toString();
                        DatabaseReference reference = database.getReference();
                        reference.child(fileName).setValue(url).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();
                                    Toast.makeText(ai_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(ai_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(ai_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {

                int currentProgress = (int) (100 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
                progressDialog.setProgress(currentProgress);
            }
        });
    }

    //
    // - AI Misc -
    //

    private void miscellaneous_uploadFile_1(Uri miscellaneous_pdfURI_1) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();

        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("AI_Misc").child(fileName).putFile(miscellaneous_pdfURI_1)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        String url = taskSnapshot.getMetadata().getReference().getDownloadUrl().toString();
                        DatabaseReference reference = database.getReference();
                        reference.child(fileName).setValue(url).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();
                                    Toast.makeText(ai_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(ai_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(ai_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {

                int currentProgress = (int) (100 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
                progressDialog.setProgress(currentProgress);
            }
        });
    }
    //
    //
    // -----------------------------------------------------------------------------------
    //
    //

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == 9 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF();
        }
        if (requestCode == 10 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_1();
        }
        if (requestCode == 11 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_2();
        }
        if (requestCode == 12 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_3();
        }
        if (requestCode == 13 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_4();
        }
        if (requestCode == 250 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            qp_selectPDF_1();
        }
        if (requestCode == 350 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            syllabus_selectPDF_1();
        }
        if (requestCode == 450 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            miscellaneous_selectPDF_1();
        }
        else
         {
            Toast.makeText(ai_cse_fifthsem.this, "Please Provide Storage Access!", Toast.LENGTH_SHORT).show();
        }
    }
    //
    //
    //

    private void selectPDF() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 3);
    }

    private void selectPDF_1() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 4);
    }

    private void selectPDF_2() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 5);
    }

    private void selectPDF_3() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 6);
    }

    private void selectPDF_4() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 7);
    }

    private void qp_selectPDF_1() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 251);
    }

    private void syllabus_selectPDF_1() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 351);
    }

    private void miscellaneous_selectPDF_1() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 451);
    }

    //
    //
    //

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        {

            if (requestCode == 3 && resultCode == RESULT_OK && data != null) {
                Toast.makeText(ai_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
                pdfURI_1 = data.getData();
                upload_status_1.setText(data.getData().getLastPathSegment().split("\\.")[0].split("\\(")[0]);;
                Toast.makeText(ai_cse_fifthsem.this, upload_status_1.getText(), Toast.LENGTH_SHORT).show();
            }

        if (requestCode == 4 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(ai_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_2 = data.getData();
            upload_status_2.setText(data.getData().getLastPathSegment().split("\\.")[0].split("\\(")[0]);;
            Toast.makeText(ai_cse_fifthsem.this, upload_status_2.getText(), Toast.LENGTH_SHORT).show();
        }

        if (requestCode == 5 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(ai_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_3 = data.getData();
            upload_status_3.setText(data.getData().getLastPathSegment().split("\\.")[0].split("\\(")[0]);;
            Toast.makeText(ai_cse_fifthsem.this, upload_status_3.getText(), Toast.LENGTH_SHORT).show();
        }
        if (requestCode == 6 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(ai_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_4 = data.getData();
            upload_status_4.setText(data.getData().getLastPathSegment().split("\\.")[0].split("\\(")[0]);;
            Toast.makeText(ai_cse_fifthsem.this, upload_status_4.getText(), Toast.LENGTH_SHORT).show();
        }
        if (requestCode == 7 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(ai_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_5 = data.getData();
            upload_status_5.setText(data.getData().getLastPathSegment().split("\\.")[0].split("\\(")[0]);;
            Toast.makeText(ai_cse_fifthsem.this, upload_status_5.getText(), Toast.LENGTH_SHORT).show();
        }
        if (requestCode == 251 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(ai_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            qp_pdfURI_1 = data.getData();
            qp_status_1.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 351 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(ai_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            syllabus_pdfURI_1 = data.getData();
            syllabus_status_1.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 451 && resultCode == RESULT_OK && data != null) {
           Toast.makeText(ai_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
           miscellaneous_pdfURI_1 = data.getData();
           miscellaneous_status_1.setText(data.getData().getLastPathSegment());
        }

        if(data==null){
            Toast.makeText(ai_cse_fifthsem.this, "File not selected!", Toast.LENGTH_SHORT).show();
        }
        }
    }
}