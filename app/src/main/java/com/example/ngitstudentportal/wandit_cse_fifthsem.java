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
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphImageButton;

public class wandit_cse_fifthsem extends AppCompatActivity {

    NeumorphButton button26;
    NeumorphImageButton upload_26;
    TextView upload_status_26;
    Uri pdfURI_26;
    //
    //
    NeumorphButton button27;
    NeumorphImageButton upload_27;
    TextView upload_status_27;
    Uri pdfURI_27;
    //
    //
    NeumorphButton button28;
    NeumorphImageButton upload_28;
    TextView upload_status_28;
    Uri pdfURI_28;
    //
    //
    NeumorphButton button29;
    NeumorphImageButton upload_29;
    TextView upload_status_29;
    Uri pdfURI_29;
    //
    //
    NeumorphButton button30;
    NeumorphImageButton upload_30;
    TextView upload_status_30;
    Uri pdfURI_30;
    //
    //
    NeumorphButton qp_button6;
    NeumorphImageButton qp_upload_6;
    TextView qp_status_6;
    Uri qp_pdfURI_6;
    //
    //
    NeumorphButton syllabus_button_6;
    NeumorphImageButton syllabus_upload_6;
    TextView syllabus_status_6;
    Uri syllabus_pdfURI_6;
    //
    //
    NeumorphButton miscellaneous_button_6;
    NeumorphImageButton miscellaneous_upload_6;
    TextView miscellaneous_status_6;
    Uri miscellaneous_pdfURI_6;
    //
    //
    FirebaseStorage storage;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wandit_cse_fifthsem);

        storage = FirebaseStorage.getInstance();
        database = FirebaseDatabase.getInstance();
        //
        //
        button26 = findViewById(R.id.button26);
        upload_26 = findViewById(R.id.upload_26);
        upload_status_26 = findViewById(R.id.upload_status_26);
        //
        //
        button27 = findViewById(R.id.button27);
        upload_27 = findViewById(R.id.upload_27);
        upload_status_27 = findViewById(R.id.upload_status_27);
        //
        //
        button28 = findViewById(R.id.button28);
        upload_28 = findViewById(R.id.upload_28);
        upload_status_28 = findViewById(R.id.upload_status_28);
        //
        //
        button29 = findViewById(R.id.button29);
        upload_29 = findViewById(R.id.upload_29);
        upload_status_29 = findViewById(R.id.upload_status_29);
        //
        //
        button30 = findViewById(R.id.button30);
        upload_30 = findViewById(R.id.upload_30);
        upload_status_30 = findViewById(R.id.upload_status_30);
        //
        //
        qp_button6= findViewById(R.id.qp_button6);
        qp_upload_6 = findViewById(R.id.qp_upload_6);
        qp_status_6 = findViewById(R.id.qp_status_6);
        //
        //
        syllabus_button_6 = findViewById(R.id.syllabus_button_6);
        syllabus_upload_6 = findViewById(R.id.syllabus_upload_6);
        syllabus_status_6 = findViewById(R.id.syllabus_status_6);
        //
        //
        miscellaneous_button_6 = findViewById(R.id.miscellaneous_button_6);
        miscellaneous_upload_6 = findViewById(R.id.miscellaneous_upload_6);
        miscellaneous_status_6 = findViewById(R.id.miscellaneous_status_6);
        //
        //
        // ------ Selecting Files using the Choose File Button ------
        //
        //
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(wandit_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_26();
                } else {
                    ActivityCompat.requestPermissions(wandit_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 34);
                }
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(wandit_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_27();
                } else {
                    ActivityCompat.requestPermissions(wandit_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 35);
                }
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(wandit_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_28();
                } else {
                    ActivityCompat.requestPermissions(wandit_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 36);
                }
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(wandit_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_29();
                } else {
                    ActivityCompat.requestPermissions(wandit_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 37);
                }
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(wandit_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_30();
                } else {
                    ActivityCompat.requestPermissions(wandit_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 38);
                }
            }
        });

        qp_button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(wandit_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    qp_selectPDF_6();
                } else {
                    ActivityCompat.requestPermissions(wandit_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 260);
                }
            }
        });

        syllabus_button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(wandit_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    syllabus_selectPDF_6();
                } else {
                    ActivityCompat.requestPermissions(wandit_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 360);
                }
            }
        });

        miscellaneous_button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(wandit_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    miscellaneous_selectPDF_6();
                } else {
                    ActivityCompat.requestPermissions(wandit_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 460);
                }
            }
        });
        //
        //
        //------ Uploading Files using the Upload image button ------
        //
        //
        upload_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_26 != null) {
                    uploadFile_26(pdfURI_26);
                } else {
                    Toast.makeText(wandit_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_27 != null) {
                    uploadFile_27(pdfURI_27);
                } else {
                    Toast.makeText(wandit_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_28 != null) {
                    uploadFile_28(pdfURI_28);
                } else {
                    Toast.makeText(wandit_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_29 != null) {
                    uploadFile_29(pdfURI_29);
                } else {
                    Toast.makeText(wandit_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_30 != null) {
                    uploadFile_30(pdfURI_30);
                } else {
                    Toast.makeText(wandit_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    
      qp_upload_6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qp_pdfURI_6 != null) {
                qp_uploadFile_6(qp_pdfURI_6);
            } else {
                Toast.makeText(wandit_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
            }
        }
    });

        syllabus_upload_6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (syllabus_pdfURI_6 != null) {
                syllabus_uploadFile_6(syllabus_pdfURI_6);
            } else {
                Toast.makeText(wandit_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
            }
        }
    });

        miscellaneous_upload_6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (miscellaneous_pdfURI_6 != null) {
                miscellaneous_uploadFile_6(miscellaneous_pdfURI_6);
            } else {
                Toast.makeText(wandit_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
            }
        }
    });
}

    //
    // - UNIT:1
    //

    private void uploadFile_26(Uri pdfURI_26) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("W&IT_Unit_1").child(fileName).putFile(pdfURI_26)
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
                                    Toast.makeText(wandit_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(wandit_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(wandit_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_27(Uri pdfURI_27) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("W&IT_UNIT_2").child(fileName).putFile(pdfURI_27)
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
                                    Toast.makeText(wandit_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(wandit_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(wandit_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_28(Uri pdfURI_28) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("W&IT_UNIT_3").child(fileName).putFile(pdfURI_28)
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
                                    Toast.makeText(wandit_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(wandit_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(wandit_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_29(Uri pdfURI_29) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("W&IT_UNIT_4").child(fileName).putFile(pdfURI_29)
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
                                    Toast.makeText(wandit_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(wandit_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(wandit_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_30(Uri pdfURI_30) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("W&IT_UNIT_5").child(fileName).putFile(pdfURI_30)
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
                                    Toast.makeText(wandit_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(wandit_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(wandit_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
    // - W&IT Question Paper -
    //

    private void qp_uploadFile_6 (Uri qp_pdfURI_6){
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("W&IT_QP").child(fileName).putFile(qp_pdfURI_6)
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
                                    Toast.makeText(wandit_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(wandit_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(wandit_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
    // - W&IT Syllabus -
    //

    private void syllabus_uploadFile_6 (Uri syllabus_pdfURI_6){
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("W&IT_Syllabus").child(fileName).putFile(syllabus_pdfURI_6)
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
                                    Toast.makeText(wandit_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(wandit_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(wandit_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
    // - W&IT Misc -
    //

    private void miscellaneous_uploadFile_6 (Uri miscellaneous_pdfURI_6){
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();

        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("W&IT_Misc").child(fileName).putFile(miscellaneous_pdfURI_6)
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
                                    Toast.makeText(wandit_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(wandit_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(wandit_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        if (requestCode == 34 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_26();
        }
        if (requestCode == 35 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_27();
        }
        if (requestCode == 36 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_28();
        }
        if (requestCode == 37 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_29();
        }
        if (requestCode == 38 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_30();
        }
        if (requestCode == 260 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            qp_selectPDF_6();
        }
        if (requestCode == 360 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            syllabus_selectPDF_6();
        }
        if (requestCode == 460 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            miscellaneous_selectPDF_6();
        }
        else {
            Toast.makeText(wandit_cse_fifthsem.this, "Please Provide Storage Access!", Toast.LENGTH_SHORT).show();
        }
    }

    //
    //
    //

    private void selectPDF_26() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 71);
    }

    private void selectPDF_27() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 72);
    }

    private void selectPDF_28() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 73);
    }

    private void selectPDF_29() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 74);
    }

    private void selectPDF_30() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 75);
    }

    private void qp_selectPDF_6() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 261);
    }

    private void syllabus_selectPDF_6() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 361);
    }

    private void miscellaneous_selectPDF_6() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 461);
    }

    //
    //
    //

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 71 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(wandit_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_26 = data.getData();
            upload_status_26.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 72 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(wandit_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_27 = data.getData();
            upload_status_27.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 73 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(wandit_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_28 = data.getData();
            upload_status_28.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 74 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(wandit_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_29 = data.getData();
            upload_status_29.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 75 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(wandit_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_30 = data.getData();
            upload_status_30.setText(data.getData().getLastPathSegment());
        }

        if (requestCode == 261 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(wandit_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            qp_pdfURI_6 = data.getData();
            qp_status_6.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 361 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(wandit_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            syllabus_pdfURI_6 = data.getData();
            syllabus_status_6.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 461 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(wandit_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            miscellaneous_pdfURI_6 = data.getData();
            miscellaneous_status_6.setText(data.getData().getLastPathSegment());
        }
        if(data == null) {
            Toast.makeText(wandit_cse_fifthsem.this, "File not selected!", Toast.LENGTH_SHORT).show();
        }
    }
}