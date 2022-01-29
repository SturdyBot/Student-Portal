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

public class alc_cse_fifthsem extends AppCompatActivity {

    NeumorphButton button6;
    NeumorphImageButton upload_6;
    TextView upload_status_6;
    Uri pdfURI_6;
    //
    //
    NeumorphButton button7;
    NeumorphImageButton upload_7;
    TextView upload_status_7;
    Uri pdfURI_7;
    //
    //
    NeumorphButton button8;
    NeumorphImageButton upload_8;
    TextView upload_status_8;
    Uri pdfURI_8;
    //
    //
    NeumorphButton button9;
    NeumorphImageButton upload_9;
    TextView upload_status_9;
    Uri pdfURI_9;
    //
    //
    NeumorphButton button10;
    NeumorphImageButton upload_10;
    TextView upload_status_10;
    Uri pdfURI_10;
    //
    //
    NeumorphButton qp_button2;
    NeumorphImageButton qp_upload_2;
    TextView qp_status_2;
    Uri qp_pdfURI_2;
    //
    //
    NeumorphButton syllabus_button_2;
    NeumorphImageButton syllabus_upload_2;
    TextView syllabus_status_2;
    Uri syllabus_pdfURI_2;
    //
    //
    NeumorphButton miscellaneous_button_2;
    NeumorphImageButton miscellaneous_upload_2;
    TextView miscellaneous_status_2;
    Uri miscellaneous_pdfURI_2;
    //
    //
    FirebaseStorage storage;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc_cse_fifthsem);

        storage = FirebaseStorage.getInstance();
        database = FirebaseDatabase.getInstance();
        //
        //
        button6 = findViewById(R.id.button6);
        upload_6 = findViewById(R.id.upload_6);
        upload_status_6 = findViewById(R.id.upload_status_6);
        //
        //
        button7 = findViewById(R.id.button7);
        upload_7 = findViewById(R.id.upload_7);
        upload_status_7 = findViewById(R.id.upload_status_7);
        //
        //
        button8 = findViewById(R.id.button8);
        upload_8 = findViewById(R.id.upload_8);
        upload_status_8 = findViewById(R.id.upload_status_8);
        //
        //
        button9 = findViewById(R.id.button9);
        upload_9 = findViewById(R.id.upload_9);
        upload_status_9 = findViewById(R.id.upload_status_9);
        //
        //
        button10 = findViewById(R.id.button10);
        upload_10 = findViewById(R.id.upload_10);
        upload_status_10 = findViewById(R.id.upload_status_10);
        //
        //
        qp_button2= findViewById(R.id.qp_button2);
        qp_upload_2 = findViewById(R.id.qp_upload_2);
        qp_status_2 = findViewById(R.id.qp_status_2);
        //
        //
        syllabus_button_2 = findViewById(R.id.syllabus_button_2);
        syllabus_upload_2 = findViewById(R.id.syllabus_upload_2);
        syllabus_status_2 = findViewById(R.id.syllabus_status_2);
        //
        //
        miscellaneous_button_2 = findViewById(R.id.miscellaneous_button_2);
        miscellaneous_upload_2 = findViewById(R.id.miscellaneous_upload_2);
        miscellaneous_status_2 = findViewById(R.id.miscellaneous_status_2);
        //
        //
        // ------ Selecting Files using the Choose File Button ------
        //
        //
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(alc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_6();
                } else {
                    ActivityCompat.requestPermissions(alc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 14);
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(alc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_7();
                } else {
                    ActivityCompat.requestPermissions(alc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 15);
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(alc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_8();
                } else {
                    ActivityCompat.requestPermissions(alc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 16);
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(alc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_9();
                } else {
                    ActivityCompat.requestPermissions(alc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 17);
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(alc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_10();
                } else {
                    ActivityCompat.requestPermissions(alc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 18);
                }
            }
        });

        qp_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(alc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    qp_selectPDF_2();
                } else {
                    ActivityCompat.requestPermissions(alc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 252);
                }
            }
        });

        syllabus_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(alc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    syllabus_selectPDF_2();
                } else {
                    ActivityCompat.requestPermissions(alc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 352);
                }
            }
        });

        miscellaneous_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(alc_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    miscellaneous_selectPDF_2();
                } else {
                    ActivityCompat.requestPermissions(alc_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 452);
                }
            }
        });
        //
        //
        //------ Uploading Files using the Upload image button ------
        //
        //
        upload_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_6 != null) {
                    uploadFile_6(pdfURI_6);
                } else {
                    Toast.makeText(alc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_7 != null) {
                    uploadFile_7(pdfURI_7);
                } else {
                    Toast.makeText(alc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_8 != null) {
                    uploadFile_8(pdfURI_8);
                } else {
                    Toast.makeText(alc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_9 != null) {
                    uploadFile_9(pdfURI_9);
                } else {
                    Toast.makeText(alc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_10 != null) {
                    uploadFile_10(pdfURI_10);
                } else {
                    Toast.makeText(alc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        qp_upload_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (qp_pdfURI_2 != null) {
                    qp_uploadFile_2(qp_pdfURI_2);
                } else {
                    Toast.makeText(alc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        syllabus_upload_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (syllabus_pdfURI_2 != null) {
                    syllabus_uploadFile_2(syllabus_pdfURI_2);
                } else {
                    Toast.makeText(alc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        miscellaneous_upload_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (miscellaneous_pdfURI_2 != null) {
                    miscellaneous_uploadFile_2(miscellaneous_pdfURI_2);
                } else {
                    Toast.makeText(alc_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //
    // - UNIT:1
    //

    private void uploadFile_6(Uri pdfURI_6) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        final String fileName = System.currentTimeMillis() + ".pdf";
        final String fileName1 = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("ALC_Unit_1").child(fileName).putFile(pdfURI_6)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        String url = taskSnapshot.getMetadata().getReference().getDownloadUrl().toString();
                        DatabaseReference reference = database.getReference();
                        reference.child(fileName1).setValue(url).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    progressDialog.dismiss();
                                    Toast.makeText(alc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(alc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(alc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_7(Uri pdfURI_7) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("ALC_UNIT_2").child(fileName).putFile(pdfURI_7)
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
                                    Toast.makeText(alc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(alc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(alc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_8(Uri pdfURI_8) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("ALC_UNIT_3").child(fileName).putFile(pdfURI_8)
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
                                    Toast.makeText(alc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(alc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(alc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_9(Uri pdfURI_9) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("ALC_UNIT_4").child(fileName).putFile(pdfURI_9)
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
                                    Toast.makeText(alc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(alc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(alc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_10(Uri pdfURI_10) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("ALC_UNIT_5").child(fileName).putFile(pdfURI_10)
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
                                    Toast.makeText(alc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(alc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(alc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
    // - ALC Question Paper -
    //

    private void qp_uploadFile_2(Uri qp_pdfURI_2) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("ALC_QP").child(fileName).putFile(qp_pdfURI_2)
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
                                    Toast.makeText(alc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(alc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(alc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
    // - ALC Syllabus -
    //

    private void syllabus_uploadFile_2(Uri syllabus_pdfURI_2) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("ALC_Syllabus").child(fileName).putFile(syllabus_pdfURI_2)
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
                                    Toast.makeText(alc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(alc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(alc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
    // - ALC Misc -
    //

    private void miscellaneous_uploadFile_2(Uri miscellaneous_pdfURI_2) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();

        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("ALC_Misc").child(fileName).putFile(miscellaneous_pdfURI_2)
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
                                    Toast.makeText(alc_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(alc_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(alc_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        if (requestCode == 14 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_6();
        }
        if (requestCode == 15 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_7();
        }
        if (requestCode == 16 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_8();
        }
        if (requestCode == 17 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_9();
        }
        if (requestCode == 18 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_10();
        }
        if (requestCode == 252 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            qp_selectPDF_2();
        }
        if (requestCode == 352 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            syllabus_selectPDF_2();
        }
        if (requestCode == 452 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            miscellaneous_selectPDF_2();
        }
        else {
            Toast.makeText(alc_cse_fifthsem.this, "Please Provide Storage Access!", Toast.LENGTH_SHORT).show();
        }
    }

    //
    //
    //

    private void selectPDF_6() {
        Intent intent = new Intent();
        intent.setType("application/pdf");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 51);
    }

    private void selectPDF_7() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 52);
    }

    private void selectPDF_8() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 53);
    }

    private void selectPDF_9() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 54);
    }

    private void selectPDF_10() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 55);
    }

    private void qp_selectPDF_2() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 253);
    }

    private void syllabus_selectPDF_2() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 353);
    }

    private void miscellaneous_selectPDF_2() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 453);
    }

    //
    //
    //

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 51 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(alc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_6 = data.getData();
            upload_status_6.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 52 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(alc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_7 = data.getData();
            upload_status_7.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 53 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(alc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_8 = data.getData();
            upload_status_8.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 54 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(alc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_9 = data.getData();
            upload_status_9.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 55 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(alc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_10 = data.getData();
            upload_status_10.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 253 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(alc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            qp_pdfURI_2 = data.getData();
            qp_status_2.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 353 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(alc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            syllabus_pdfURI_2 = data.getData();
            syllabus_status_2.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 453 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(alc_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            miscellaneous_pdfURI_2 = data.getData();
            miscellaneous_status_2.setText(data.getData().getLastPathSegment());
        }
        if(data==null){
            Toast.makeText(alc_cse_fifthsem.this, "File not selected!", Toast.LENGTH_SHORT).show();
        }
    }
}