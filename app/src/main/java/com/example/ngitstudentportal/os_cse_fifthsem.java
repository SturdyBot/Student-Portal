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

public class os_cse_fifthsem extends AppCompatActivity {

    NeumorphButton button21;
    NeumorphImageButton upload_21;
    TextView upload_status_21;
    Uri pdfURI_21;
    //
    //
    NeumorphButton button22;
    NeumorphImageButton upload_22;
    TextView upload_status_22;
    Uri pdfURI_22;
    //
    //
    NeumorphButton button23;
    NeumorphImageButton upload_23;
    TextView upload_status_23;
    Uri pdfURI_23;
    //
    //
    NeumorphButton button24;
    NeumorphImageButton upload_24;
    TextView upload_status_24;
    Uri pdfURI_24;
    //
    //
    NeumorphButton button25;
    NeumorphImageButton upload_25;
    TextView upload_status_25;
    Uri pdfURI_25;
    //
    //
    NeumorphButton qp_button5;
    NeumorphImageButton qp_upload_5;
    TextView qp_status_5;
    Uri qp_pdfURI_5;
    //
    //
    NeumorphButton syllabus_button_5;
    NeumorphImageButton syllabus_upload_5;
    TextView syllabus_status_5;
    Uri syllabus_pdfURI_5;
    //
    //
    NeumorphButton miscellaneous_button_5;
    NeumorphImageButton miscellaneous_upload_5;
    TextView miscellaneous_status_5;
    Uri miscellaneous_pdfURI_5;
    //
    //
    FirebaseStorage storage;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_cse_fifthsem);

        storage = FirebaseStorage.getInstance();
        database = FirebaseDatabase.getInstance();
        //
        //
        button21 = findViewById(R.id.button21);
        upload_21 = findViewById(R.id.upload_21);
        upload_status_21 = findViewById(R.id.upload_status_21);
        //
        //
        button22 = findViewById(R.id.button22);
        upload_22 = findViewById(R.id.upload_22);
        upload_status_22 = findViewById(R.id.upload_status_22);
        //
        //
        button23 = findViewById(R.id.button23);
        upload_23 = findViewById(R.id.upload_23);
        upload_status_23 = findViewById(R.id.upload_status_23);
        //
        //
        button24 = findViewById(R.id.button24);
        upload_24 = findViewById(R.id.upload_24);
        upload_status_24 = findViewById(R.id.upload_status_24);
        //
        //
        button25 = findViewById(R.id.button25);
        upload_25 = findViewById(R.id.upload_25);
        upload_status_25 = findViewById(R.id.upload_status_25);
        //
        //
        qp_button5= findViewById(R.id.qp_button5);
        qp_upload_5 = findViewById(R.id.qp_upload_5);
        qp_status_5 = findViewById(R.id.qp_status_5);
        //
        //
        syllabus_button_5 = findViewById(R.id.syllabus_button_5);
        syllabus_upload_5 = findViewById(R.id.syllabus_upload_5);
        syllabus_status_5 = findViewById(R.id.syllabus_status_5);
        //
        //
        miscellaneous_button_5 = findViewById(R.id.miscellaneous_button_5);
        miscellaneous_upload_5 = findViewById(R.id.miscellaneous_upload_5);
        miscellaneous_status_5 = findViewById(R.id.miscellaneous_status_5);
        //
        //
        // ------ Selecting Files using the Choose File Button ------
        //
        //
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(os_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_21();
                } else {
                    ActivityCompat.requestPermissions(os_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 29);
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(os_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_22();
                } else {
                    ActivityCompat.requestPermissions(os_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 30);
                }
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(os_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_23();
                } else {
                    ActivityCompat.requestPermissions(os_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 31);
                }
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(os_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_24();
                } else {
                    ActivityCompat.requestPermissions(os_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 32);
                }
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(os_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    selectPDF_25();
                } else {
                    ActivityCompat.requestPermissions(os_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 33);
                }
            }
        });

        qp_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(os_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    qp_selectPDF_5();
                } else {
                    ActivityCompat.requestPermissions(os_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 258);
                }
            }
        });

        syllabus_button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(os_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    syllabus_selectPDF_5();
                } else {
                    ActivityCompat.requestPermissions(os_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 358);
                }
            }
        });

        miscellaneous_button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(os_cse_fifthsem.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    miscellaneous_selectPDF_5();
                } else {
                    ActivityCompat.requestPermissions(os_cse_fifthsem.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 458);
                }
            }
        });
        //
        //
        //------ Uploading Files using the Upload image button ------
        //
        //
        upload_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_21 != null) {
                    uploadFile_21(pdfURI_21);
                } else {
                    Toast.makeText(os_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_22 != null) {
                    uploadFile_22(pdfURI_22);
                } else {
                    Toast.makeText(os_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_23 != null) {
                    uploadFile_23(pdfURI_23);
                } else {
                    Toast.makeText(os_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_24 != null) {
                    uploadFile_24(pdfURI_24);
                } else {
                    Toast.makeText(os_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        upload_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pdfURI_25 != null) {
                    uploadFile_25(pdfURI_25);
                } else {
                    Toast.makeText(os_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        qp_upload_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (qp_pdfURI_5 != null) {
                    qp_uploadFile_5(qp_pdfURI_5);
                } else {
                    Toast.makeText(os_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        syllabus_upload_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (syllabus_pdfURI_5 != null) {
                    syllabus_uploadFile_5(syllabus_pdfURI_5);
                } else {
                    Toast.makeText(os_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        miscellaneous_upload_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (miscellaneous_pdfURI_5 != null) {
                    miscellaneous_uploadFile_5(miscellaneous_pdfURI_5);
                } else {
                    Toast.makeText(os_cse_fifthsem.this, "Select a File!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //
    // - UNIT:1
    //

    private void uploadFile_21(Uri pdfURI_21) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("OS_Unit_1").child(fileName).putFile(pdfURI_21)
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
                                    Toast.makeText(os_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(os_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(os_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_22(Uri pdfURI_22) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("OS_UNIT_2").child(fileName).putFile(pdfURI_22)
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
                                    Toast.makeText(os_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(os_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(os_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_23(Uri pdfURI_23) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("OS_UNIT_3").child(fileName).putFile(pdfURI_23)
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
                                    Toast.makeText(os_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(os_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(os_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_24(Uri pdfURI_24) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("OS_UNIT_4").child(fileName).putFile(pdfURI_24)
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
                                    Toast.makeText(os_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(os_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(os_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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

    private void uploadFile_25(Uri pdfURI_25) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle("Uploading File...");
        progressDialog.setProgress(0);
        progressDialog.show();


        String fileName = System.currentTimeMillis() + "";
        StorageReference storageReference = storage.getReference();
        storageReference.child("OS_UNIT_5").child(fileName).putFile(pdfURI_25)
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
                                    Toast.makeText(os_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(os_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(os_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        // - OS Question Paper -
        //

        private void qp_uploadFile_5 (Uri qp_pdfURI_5){
            progressDialog = new ProgressDialog(this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progressDialog.setTitle("Uploading File...");
            progressDialog.setProgress(0);
            progressDialog.show();


            String fileName = System.currentTimeMillis() + "";
            StorageReference storageReference = storage.getReference();
            storageReference.child("OS_QP").child(fileName).putFile(qp_pdfURI_5)
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
                                        Toast.makeText(os_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(os_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(os_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        // - OS Syllabus -
        //

        private void syllabus_uploadFile_5 (Uri syllabus_pdfURI_5){
            progressDialog = new ProgressDialog(this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progressDialog.setTitle("Uploading File...");
            progressDialog.setProgress(0);
            progressDialog.show();


            String fileName = System.currentTimeMillis() + "";
            StorageReference storageReference = storage.getReference();
            storageReference.child("OS_Syllabus").child(fileName).putFile(syllabus_pdfURI_5)
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
                                        Toast.makeText(os_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(os_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(os_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        // - OS Misc -
        //

        private void miscellaneous_uploadFile_5 (Uri miscellaneous_pdfURI_5){
            progressDialog = new ProgressDialog(this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progressDialog.setTitle("Uploading File...");
            progressDialog.setProgress(0);
            progressDialog.show();

            String fileName = System.currentTimeMillis() + "";
            StorageReference storageReference = storage.getReference();
            storageReference.child("OS_Misc").child(fileName).putFile(miscellaneous_pdfURI_5)
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
                                        Toast.makeText(os_cse_fifthsem.this, "File Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(os_cse_fifthsem.this, "File not Successfully Uploaded", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(os_cse_fifthsem.this, "File not Uploaded!", Toast.LENGTH_SHORT).show();

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
        if (requestCode == 29 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_21();
        }
        if (requestCode == 30 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_22();
        }
        if (requestCode == 31 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_23();
        }
        if (requestCode == 32 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_24();
        }
        if (requestCode == 33 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            selectPDF_25();
        }
        if (requestCode == 258 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            qp_selectPDF_5();
        }
        if (requestCode == 358 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            syllabus_selectPDF_5();
        }
        if (requestCode == 458 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            miscellaneous_selectPDF_5();
        }
        else {
            Toast.makeText(os_cse_fifthsem.this, "Please Provide Storage Access!", Toast.LENGTH_SHORT).show();
        }
    }

    //
    //
    //

    private void selectPDF_21() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 66);
    }

    private void selectPDF_22() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 67);
    }

    private void selectPDF_23() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 68);
    }

    private void selectPDF_24() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 69);
    }

    private void selectPDF_25() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 70);
    }

    private void qp_selectPDF_5() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 259);
    }

    private void syllabus_selectPDF_5() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 359);
    }

    private void miscellaneous_selectPDF_5() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 459);
    }

    //
    //
    //

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 66 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(os_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_21 = data.getData();
            upload_status_21.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 67 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(os_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_22 = data.getData();
            upload_status_22.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 68 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(os_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_23 = data.getData();
            upload_status_23.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 69 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(os_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_24 = data.getData();
            upload_status_24.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 70 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(os_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            pdfURI_25 = data.getData();
            upload_status_25.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 259 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(os_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            qp_pdfURI_5 = data.getData();
            qp_status_5.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 359 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(os_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            syllabus_pdfURI_5 = data.getData();
            syllabus_status_5.setText(data.getData().getLastPathSegment());
        }
        if (requestCode == 459 && resultCode == RESULT_OK && data != null) {
            Toast.makeText(os_cse_fifthsem.this, "File selected!", Toast.LENGTH_SHORT).show();
            miscellaneous_pdfURI_5 = data.getData();
            miscellaneous_status_5.setText(data.getData().getLastPathSegment());
        }
        if (data == null){
            Toast.makeText(os_cse_fifthsem.this, "File not selected!", Toast.LENGTH_SHORT).show();
        }
    }
}