package com.asish.companyinfo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.asish.companyinfo.R;
import com.asish.companyinfo.models.CompanyModel;
import java.util.List;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.CompanyViewHolder> {

    private List<CompanyModel> companies;

    public CompanyAdapter(List<CompanyModel> companies) {
        this.companies = companies;
    }

    /**
     * onCreateViewHolder method is responsible to inflate or display the single row layout.
     */
    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.company_row_item, parent, false);
        return new CompanyViewHolder(view);
    }

    /**
     * onBindViewHolder method is responsible to bind the value to the view.
     */
    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder holder, int position) {
        CompanyModel companyModel = companies.get(position);
        holder.getLogo().setImageResource(companyModel.getLogo());
        holder.getName().setText(companyModel.getName());
        holder.getCeo().setText(companyModel.getCeoName());
    }

    /**
     * @return Size of the RecyclerView.
     */
    @Override
    public int getItemCount() {
        return companies.size();
    }

    public static class CompanyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView logo;
        private final TextView name;
        private final TextView ceo;

        public CompanyViewHolder(@NonNull View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.iv_logo);
            name = itemView.findViewById(R.id.tv_name);
            ceo = itemView.findViewById(R.id.tv_ceo);
        }

        public ImageView getLogo() {
            return logo;
        }

        public TextView getName() {
            return name;
        }

        public TextView getCeo() {
            return ceo;
        }
    }
}
