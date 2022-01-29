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

public class se_cse_fifthsem extends AppCompatActivity {

    NeumorphButton button16;
    NeumorphImageButton upload_16;
    TextView upload_status_16;
    Uri pdfURI_16;
    //
    //
    NeumorphButton button17;
    NeumorphImageButton upload_17;
    TextView upload_status_17;
    Uri pdfURI_17;
    //
    //
    NeumorphButton button18;
    NeumorphImageButton upload_18;
    TextView upload_status_18;
    Uri pdfURI_18;
    //
    //
    NeumorphButton button19;
    NeumorphImageButton upload_19;
    TextView upload_status_19;
    Uri pdfURI_19;
    //
    //
    NeumorphButton button20;
    NeumorphImageButton upload_20;
    TextView upload_status_20;
    Uri pdfURI_20;
    //
    //
    NeumorphButton qp_button4;
    NeumorphImageButton qp_upload_4;
    TextView qp_status_4;
    Uri qp_pdfURI_4;
    //
    //
    NeumorphButton syllabus_button_4;
    NeumorphImageButton syllabus_upload_4;
    TextView syllabus_status_4;
    Uri syllabus_pdfURI_4;
    //
    //
    NeumorphButton miscellaneous_button_4;
    NeumorphImageButton miscellaneous_upload_4;
    TextView miscellaneous_status_4;
    Uri miscellaneous_pdfURI_4;
    //
    //
    FirebaseStorage storage;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se_cse_fifthsem);

        storage = FirebaseStorage.getInstance();
        database = FirebaseDatabase.getInstance();
        //
        //
        button16 = findViewById(R.id.button16);
        upload_16 = findViewById(R.id.upload_16);
        upload_status_16 = findViewById(R.id.upload_status_16);
        //
        //
        button17 = findViewById(R.id.button17);
        upload_17 = findViewById(R.id.upload_17);
        upload_status_17 = findViewById(R.id.upload_status_17);
        //
        //
        button18 = findViewById(R.id.button18);
        upload_18 = findViewById(R.id.upload_18);
        upload_status_18 = findViewById(R.id.upload_status_18);
        //
        //
        button19 = findViewById(R.id.button19);
        upload_19 = findViewById(R.id.upload_19);
        upload_status_19 = findViewById(R.id.upload_status_19);
        //
        //
        button20 = findViewById(R.id.button20);
        upload_20 = findViewById(R.id.upload_20);
        upload_status_20 = findViewById(R.id.upload_status_20);
        //
        //
        qp_button4= findViewById(R.id.qp_button4);
        qp_upload_4 = findViewById(R.id.qp_upload_4);
        qp_status_4 = findViewById(R.id.qp_status_4);
        //
        //
        syllabus_button_4 = findViewById(R.id.syllabus_button_4);
        syllabus_upload_4 = findViewById(R.id.syllabus_upload_4);
        syllabus_status_4 = findViewById(R.id.syllabus_status_4);
        //
        //
        miscellaneous_button_4 = findViewById(R.id.miscellaneous_button_4);
        miscellaneous_upload_4 = findViewById(R.id.miscellaneous_upload_4);
        miscellaneous_status_4 = findViewById(R.id.miscellaneous_status_4);
        //
        //
        // ------ Selecting Files using the Choose File Button ------
        //
        //
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(se_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_16();
                } else {
                    ActivityCompat.requestPermissions(se_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 24);
                }
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(se_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_17();
                } else {
                    ActivityCompat.requestPermissions(se_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 25);
                }
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(se_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_18();
                } else {
                    ActivityCompat.requestPermissions(se_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 26);
                }
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(se_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_19();
                } else {
                    ActivityCompat.requestPermissions(se_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 27);
                }
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(se_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_20();
                } else {
                    ActivityCompat.requestPermissions(se_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 28);
                }
            }
        });

        qp_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(se_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    qp_selectPDF_4();
                } else {
                    ActivityCompat.requestPermissions(se_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 256);
                }
            }
        });

        syllabus_button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(se_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    syllabus_selectPDF_4();
                } else {
                    ActivityCompat.requestPermissions(se_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 356);
                }
            }
        });

        miscellaneous_button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(se_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    miscellaneous_selectPDF_4();
                } else {
                    ActivityCompat.requestPermissions(se_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 456);
                }
            }
        });
        //
        //
        //------ Uploading Files using the Upload image button ------
        //
        //
        upload_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_16 != null) {
                    uploadFile_16(pdfURI_16);
                } else {
                    Toast.makeText(se_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_17 != null) {
                    uploadFile_17(pdfURI_17);
                } else {
                    Toast.makeText(se_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_18 != null) {
                    uploadFile_18(pdfURI_18);
                } else {
                    Toast.makeText(se_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_19 != null) {
                    uploadFile_19(pdfURI_19);
                } else {
                    Toast.makeText(se_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_20 != null) {
                    uploadFile_20(pdfURI_20);
                } else {
                    Toast.makeText(se_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        qp_upload_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (qp_pdfURI_4 != null) {
                    qp_uploadFile_4(qp_pdfURI_4);
                } else {
                    Toast.makeText(se_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        syllabus_upload_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (syllabus_pdfURI_4 != null) {
                    syllabus_uploadFile_4(syllabus_pdfURI_4);
                } else {
                    Toast.makeText(se_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        miscellaneous_upload_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (miscellaneous_pdfURI_4 != null) {
                    miscellaneous_uploadFile_4(miscellaneous_pdfURI_4);
                } else {
                    Toast.makeText(se_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //
    // - UNIT:1
    //

    private void uploadFile_16(Uri pdfURI_16) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SE_Unit_1").child(fileName).putFile(pdfURI_16)
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
                                    Toast.makeText(se_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(se_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(se_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_17(Uri pdfURI_17) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SE_UNIT_2").child(fileName).putFile(pdfURI_17)
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
                                    Toast.makeText(se_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(se_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(se_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_18(Uri pdfURI_18) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SE_UNIT_3").child(fileName).putFile(pdfURI_18)
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
                                    Toast.makeText(se_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(se_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(se_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_19(Uri pdfURI_19) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SE_UNIT_4").child(fileName).putFile(pdfURI_19)
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
                                    Toast.makeText(se_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(se_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(se_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_20(Uri pdfURI_20) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("SE_UNIT_5").child(fileName).putFile(pdfURI_20)
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
                                    Toast.makeText(se_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(se_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(se_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        // - SE Question Paper -
        //

        private void qp_uploadFile_4(Uri qp_pdfURI_4) {
            progressDialog = new ProgressDialog(this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progressDialog.setTitle("Uploading File...");
            progressDialog.setProgress(0);
            progressDialog.show();


            String fileName = System.currentTimeMillis() + "";
            StorageReference storageReference = storage.getReference();
            storageReference.child("SE_QP").child(fileName).putFile(qp_pdfURI_4)
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
                                        Toast.makeText(se_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(se_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(se_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        // - SE Syllabus -
        //

        private void syllabus_uploadFile_4(Uri syllabus_pdfURI_4) {
            progressDialog = new ProgressDialog(this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progressDialog.setTitle("Uploading File...");
            progressDialog.setProgress(0);
            progressDialog.show();


            String fileName = System.currentTimeMillis() + "";
            StorageReference storageReference = storage.getReference();
            storageReference.child("SE_Syllabus").child(fileName).putFile(syllabus_pdfURI_4)
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
                                        Toast.makeText(se_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(se_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(se_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        // - SE Misc -
        //

        private void miscellaneous_uploadFile_4(Uri miscellaneous_pdfURI_4) {
            progressDialog = new ProgressDialog(this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progressDialog.setTitle("Uploading File...");
            progressDialog.setProgress(0);
            progressDialog.show();

            String fileName = System.currentTimeMillis() + "";
            StorageReference storageReference = storage.getReference();
            storageReference.child("SE_Misc").child(fileName).putFile(miscellaneous_pdfURI_4)
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
                                        Toast.makeText(se_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(se_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(se_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        if (requestCode == 24 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_16();
        }
        if (requestCode == 25 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_17();
        }
        if (requestCode == 26 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_18();
        }
        if (requestCode == 27 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_19();
        }
        if (requestCode == 28 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_20();
        }
        if (requestCode == 256 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            qp_selectPDF_4();
        }
        if (requestCode == 356 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            syllabus_selectPDF_4();
        }
        if (requestCode == 456 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            miscellaneous_selectPDF_4();
        }
        else {
            Toast.makeText(se_cse_fifthsem.this, "Please Provide Storage Access!", Toast.LENGTH_SHORT).show();
        }
    }

    //
    //
    //

    private void selectPDF_16() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 61);
    }

    private void selectPDF_17() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 62);
    }

    private void selectPDF_18() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 63);
    }

    private void selectPDF_19() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 64);
    }

    private void selectPDF_20() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 65);
    }

    private void qp_selectPDF_4() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 257);
    }

    private void syllabus_selectPDF_4() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 357);
    }

    private void miscellaneous_selectPDF_4() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 457);
    }

    //
    //
    //

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 61 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(se_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_16 = data.getData();
            upload_status_16.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 62 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(se_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_17 = data.getData();
            upload_status_17.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 63 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(se_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_18 = data.getData();
            upload_status_18.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 64 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(se_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_19 = data.getData();
            upload_status_19.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 65 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(se_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_20 = data.getData();
            upload_status_20.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 257 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(se_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            qp_pdfURI_4 = data.getData();
            qp_status_4.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 357 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(se_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            syllabus_pdfURI_4 = data.getData();
            syllabus_status_4.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 457 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(se_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            miscellaneous_pdfURI_4 = data.getData();
            miscellaneous_status_4.setText(data.getData().getLastPathSegment());
        }
        if(data == null){
            Toast.makeText(se_cse_fifthsem.this, "File not selected!", Toast.LENGTH_SHORT).show();
        }
    }
}