package com.example.moneymanager.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.moneymanager.MainActivity;
import com.example.moneymanager.R;

public class DialogRegister {

    public  void openDialogRegister(Context context){
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_dang_ky);

        Window window= dialog.getWindow();
        if(window==null){
            return;
        }
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams layoutParams=window.getAttributes();
        layoutParams.gravity= Gravity.BOTTOM;
        window.setAttributes(layoutParams);
        dialog.setCancelable(true);

        findIdsDialog(dialog);
        dialog.show();

    }

    private void findIdsDialog(Dialog dialog) {

        Button btn_dangki_dialog=dialog.findViewById(R.id.btn_Dangky_Dialog);
        btn_dangki_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();

            }
        });


    }

}
