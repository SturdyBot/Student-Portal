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

public class sc_cse_fifthsem extends AppCompatActivity {

    NeumorphButton button11;
    NeumorphImageButton upload_11;
    TextView upload_status_11;
    Uri pdfURI_11;
    //
    //
    NeumorphButton button12;
    NeumorphImageButton upload_12;
    TextView upload_status_12;
    Uri pdfURI_12;
    //
    //
    NeumorphButton button13;
    NeumorphImageButton upload_13;
    TextView upload_status_13;
    Uri pdfURI_13;
    //
    //
    NeumorphButton button14;
    NeumorphImageButton upload_14;
    TextView upload_status_14;
    Uri pdfURI_14;
    //
    //
    NeumorphButton button15;
    NeumorphImageButton upload_15;
    TextView upload_status_15;
    Uri pdfURI_15;
    //
    //
    NeumorphButton qp_button3;
    NeumorphImageButton qp_upload_3;
    TextView qp_status_3;
    Uri qp_pdfURI_3;
    //
    //
    NeumorphButton syllabus_button_3;
    NeumorphImageButton syllabus_upload_3;
    TextView syllabus_status_3;
    Uri syllabus_pdfURI_3;
    //
    //
    NeumorphButton miscellaneous_button_3;
    NeumorphImageButton miscellaneous_upload_3;
    TextView miscellaneous_status_3;
    Uri miscellaneous_pdfURI_3;
    //
    //
    FirebaseStorage storage;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc_cse_fifthsem);

        storage = FirebaseStorage.getInstance();
        database = FirebaseDatabase.getInstance();
        //
        //
        button11 = findViewById(R.id.button11);
        upload_11 = findViewById(R.id.upload_11);
        upload_status_11 = findViewById(R.id.upload_status_11);
        //
        //
        button12 = findViewById(R.id.button12);
        upload_12 = findViewById(R.id.upload_12);
        upload_status_12 = findViewById(R.id.upload_status_12);
        //
        //
        button13 = findViewById(R.id.button13);
        upload_13 = findViewById(R.id.upload_13);
        upload_status_13 = findViewById(R.id.upload_status_13);
        //
        //
        button14 = findViewById(R.id.button14);
        upload_14 = findViewById(R.id.upload_14);
        upload_status_14 = findViewById(R.id.upload_status_14);
        //
        //
        button15 = findViewById(R.id.button15);
        upload_15 = findViewById(R.id.upload_15);
        upload_status_15 = findViewById(R.id.upload_status_15);
        //
        //
        qp_button3= findViewById(R.id.qp_button3);
        qp_upload_3 = findViewById(R.id.qp_upload_3);
        qp_status_3 = findViewById(R.id.qp_status_3);
        //
        //
        syllabus_button_3 = findViewById(R.id.syllabus_button_3);
        syllabus_upload_3 = findViewById(R.id.syllabus_upload_3);
        syllabus_status_3 = findViewById(R.id.syllabus_status_3);
        //
        //
        miscellaneous_button_3 = findViewById(R.id.miscellaneous_button_3);
        miscellaneous_upload_3 = findViewById(R.id.miscellaneous_upload_3);
        miscellaneous_status_3 = findViewById(R.id.miscellaneous_status_3);
        //
        //
        // ------ Selecting Files using the Choose File Button ------
        //
        //
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(sc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_11();
                } else {
                    ActivityCompat.requestPermissions(sc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 19);
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(sc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_12();
                } else {
                    ActivityCompat.requestPermissions(sc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 20);
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(sc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_13();
                } else {
                    ActivityCompat.requestPermissions(sc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 21);
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(sc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_14();
                } else {
                    ActivityCompat.requestPermissions(sc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 22);
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(sc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_15();
                } else {
                    ActivityCompat.requestPermissions(sc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 23);
                }
            }
        });

        qp_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(sc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    qp_selectPDF_3();
                } else {
                    ActivityCompat.requestPermissions(sc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 254);
                }
            }
        });

        syllabus_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(sc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    syllabus_selectPDF_3();
                } else {
                    ActivityCompat.requestPermissions(sc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 354);
                }
            }
        });

        miscellaneous_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(sc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    miscellaneous_selectPDF_3();
                } else {
                    ActivityCompat.requestPermissions(sc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 454);
                }
            }
        });
        //
        //
        //------ Uploading Files using the Upload image button ------
        //
        //
        upload_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_11 != null) {
                    uploadFile_11(pdfURI_11);
                } else {
                    Toast.makeText(sc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_12 != null) {
                    uploadFile_12(pdfURI_12);
                } else {
                    Toast.makeText(sc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_13 != null) {
                    uploadFile_13(pdfURI_13);
                } else {
                    Toast.makeText(sc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_14 != null) {
                    uploadFile_14(pdfURI_14);
                } else {
                    Toast.makeText(sc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_15 != null) {
                    uploadFile_15(pdfURI_15);
                } else {
                    Toast.makeText(sc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    
      qp_upload_3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (qp_pdfURI_3 != null) {
                qp_uploadFile_3(qp_pdfURI_3);
            } else {
                Toast.makeText(sc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
            }
        }
    });

        syllabus_upload_3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (syllabus_pdfURI_3 != null) {
                syllabus_uploadFile_3(syllabus_pdfURI_3);
            } else {
                Toast.makeText(sc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
            }
        }
    });

        miscellaneous_upload_3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (miscellaneous_pdfURI_3 != null) {
                miscellaneous_uploadFile_3(miscellaneous_pdfURI_3);
            } else {
                Toast.makeText(sc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
            }
        }
    });
}

    //
    // - UNIT:1
    //

    private void uploadFile_11(Uri pdfURI_11) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SC_Unit_1").child(fileName).putFile(pdfURI_11)
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
                                    Toast.makeText(sc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(sc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(sc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_12(Uri pdfURI_12) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SC_UNIT_2").child(fileName).putFile(pdfURI_12)
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
                                    Toast.makeText(sc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(sc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(sc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_13(Uri pdfURI_13) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SC_UNIT_3").child(fileName).putFile(pdfURI_13)
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
                                    Toast.makeText(sc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(sc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(sc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_14(Uri pdfURI_14) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SC_UNIT_4").child(fileName).putFile(pdfURI_14)
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
                                    Toast.makeText(sc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(sc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(sc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_15(Uri pdfURI_15) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SC_UNIT_5").child(fileName).putFile(pdfURI_15)
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
                                    Toast.makeText(sc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(sc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(sc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
    // - SC Question Paper -
    //

    private void qp_uploadFile_3(Uri qp_pdfURI_3) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SC_QP").child(fileName).putFile(qp_pdfURI_3)
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
                                    Toast.makeText(sc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(sc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(sc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
    // - SC Syllabus -
    //

    private void syllabus_uploadFile_3(Uri syllabus_pdfURI_3) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SC_Syllabus").child(fileName).putFile(syllabus_pdfURI_3)
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
                                    Toast.makeText(sc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(sc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(sc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
    // - SC Misc -
    //

    private void miscellaneous_uploadFile_3(Uri miscellaneous_pdfURI_3) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();

        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SC_Misc").child(fileName).putFile(miscellaneous_pdfURI_3)
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
                                    Toast.makeText(sc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(sc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(sc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        if (requestCode == 19 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_11();
        }
        if (requestCode == 20 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_12();
        }
        if (requestCode == 21 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_13();
        }
        if (requestCode == 22 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_14();
        }
        if (requestCode == 23 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_15();
        }
        if (requestCode == 254 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            qp_selectPDF_3();
        }
        if (requestCode == 354 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            syllabus_selectPDF_3();
        }
        if (requestCode == 454 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            miscellaneous_selectPDF_3();
        }
        else {
            Toast.makeText(sc_cse_fifthsem.this, "Please Provide Storage Access!", Toast.LENGTH_SHORT).show();
        }
    }

    //
    //
    //

    private void selectPDF_11() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 56);
    }

    private void selectPDF_12() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 57);
    }

    private void selectPDF_13() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 58);
    }

    private void selectPDF_14() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 59);
    }

    private void selectPDF_15() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 60);
    }

    private void qp_selectPDF_3() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 255);
    }

    private void syllabus_selectPDF_3() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 355);
    }

    private void miscellaneous_selectPDF_3() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 455);
    }

    //
    //
    //

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 56 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(sc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_11 = data.getData();
            upload_status_11.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 57 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(sc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_12 = data.getData();
            upload_status_12.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 58 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(sc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_13 = data.getData();
            upload_status_13.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 59 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(sc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_14 = data.getData();
            upload_status_14.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 60 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(sc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_15 = data.getData();
            upload_status_15.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 255 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(sc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            qp_pdfURI_3 = data.getData();
            qp_status_3.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 355 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(sc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            syllabus_pdfURI_3 = data.getData();
            syllabus_status_3.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 455 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(sc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            miscellaneous_pdfURI_3 = data.getData();
            miscellaneous_status_3.setText(data.getData().getLastPathSegment());
        }
       if(data == null){
           Toast.makeText(sc_cse_fifthsem.this, "File not selected!", Toast.LENGTH_SHORT).show();
       }
    }
}