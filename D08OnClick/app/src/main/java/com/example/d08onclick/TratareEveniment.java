package com.example.d08onclick;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class TratareEveniment implements View.OnClickListener {
    private Context ctx;
    public TratareEveniment(Context ctx){
        this.ctx = ctx;
    }
    @Override
    public void onClick(View v) {
        Intent it=new Intent(ctx,Main2Activity.class);
        ctx.startActivity(it);
    }
}
