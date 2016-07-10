/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.android.example.com.commontcents;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

/**
 * Provides UI for the view with List.
 */
public class ListContentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View recyclerView = inflater.inflate(
                R.layout.item_list, container, false);

        Button button = (Button) recyclerView.findViewById(R.id.plus_button);
        final ProgressBar progressBar = (ProgressBar) recyclerView.findViewById(R.id.progress_bar);
        progressBar.setScaleY(3f);

        final Handler mHandler = new Handler();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mHandler.post(new Runnable() {
                    public void run() {
                        progressBar.incrementProgressBy(10);
                        progressBar.setProgress(progressBar.getProgress());
                    }
                });
            }
        });
        return recyclerView;
    }
}
