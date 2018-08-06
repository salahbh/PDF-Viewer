package com.example.salahbanihamad.pdf_reader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfviewer extends AppCompatActivity {
    PDFView book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);

        book=(PDFView)findViewById(R.id.pdf);
        book.fromAsset("design.pdf").load();
    }
}
