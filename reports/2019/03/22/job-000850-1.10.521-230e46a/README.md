## Report for job #850

Job: **#850** | [jobs/5318b37](https://github.com/cljs-oss/canary/commit/5318b374ff115aca77fed3a7f1e4e82e84326259) | [options](options.edn) | [tasks](tasks.edn) | [travis log](https://travis-ci.org/cljs-oss/canary/builds/509785445).

Compiler: **ClojureScript 1.10.521-230e46a** | [release page](https://github.com/cljs-oss/canary/releases/tag/r1.10.521-230e46a) | [jar download](https://github.com/cljs-oss/canary/releases/download/r1.10.521-230e46a/clojurescript-1.10.521-230e46a.jar) | [source](https://github.com/clojure/clojurescript/commit/230e46aee2c9b76e426e85865ab8930c4c26e14f).

### <b style='color:red'>☹ Summary</b>

Some tasks failed! Failed 19 / 25 (executed) of total 25 tasks.

Failed tasks: [clara-rules](#-clara-rules) | [closurecomp](#-closurecomp) | [closurelib](#-closurelib) | [core-async](#-core-async) | [core-logic](#-core-logic) | [core-match](#-core-match) | [core-rrb-vector](#-core-rrb-vector) | [cuerdas](#-cuerdas) | [fulcro](#-fulcro) | [garden](#-garden) | [hoplon](#-hoplon) | [om](#-om) | [planck](#-planck) | [re-frame](#-re-frame) | [reagent](#-reagent) | [side-fx](#-side-fx) | [spec-tools](#-spec-tools) | [specter](#-specter) | [test-check](#-test-check).

### Executed Tasks

#### <b style='color:red'>&#x2717; clara-rules</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$clara_rules.invokeStatic(chkup.clj:5)
	at canary.projects.chkup$clara_rules.invoke(chkup.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; closurecomp</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [mfikes/closurecomp#486](https://travis-ci.org/mfikes/closurecomp/builds/509786257)<br>

#### <b style='color:red'>&#x2717; closurelib</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:red'>&#x2717;</b> Travis build [mfikes/closurelib#387](https://travis-ci.org/mfikes/closurelib/builds/509786247)<br>

#### <b style='color:red'>&#x2717; core-async</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$core_async.invokeStatic(chkup.clj:38)
	at canary.projects.chkup$core_async.invoke(chkup.clj:37)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; core-logic</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$core_logic.invokeStatic(chkup.clj:47)
	at canary.projects.chkup$core_logic.invoke(chkup.clj:46)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; core-match</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$core_match.invokeStatic(chkup.clj:44)
	at canary.projects.chkup$core_match.invoke(chkup.clj:43)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; core-rrb-vector</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$core_rrb_vector.invokeStatic(chkup.clj:41)
	at canary.projects.chkup$core_rrb_vector.invoke(chkup.clj:40)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; cuerdas</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$cuerdas.invokeStatic(chkup.clj:8)
	at canary.projects.chkup$cuerdas.invoke(chkup.clj:7)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; fulcro</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$fulcro.invokeStatic(chkup.clj:11)
	at canary.projects.chkup$fulcro.invoke(chkup.clj:10)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; garden</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$garden.invokeStatic(chkup.clj:14)
	at canary.projects.chkup$garden.invoke(chkup.clj:13)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; hoplon</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$hoplon.invokeStatic(chkup.clj:17)
	at canary.projects.chkup$hoplon.invoke(chkup.clj:16)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; om</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$om.invokeStatic(chkup.clj:20)
	at canary.projects.chkup$om.invoke(chkup.clj:19)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; planck</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.planck_repl$planck.invokeStatic(planck_repl.clj:15)
	at canary.projects.planck_repl$planck.invoke(planck_repl.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; re-frame</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$re_frame.invokeStatic(chkup.clj:23)
	at canary.projects.chkup$re_frame.invoke(chkup.clj:22)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; reagent</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$reagent.invokeStatic(chkup.clj:26)
	at canary.projects.chkup$reagent.invoke(chkup.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; side-fx</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.cljsrn$side_fx.invokeStatic(cljsrn.clj:5)
	at canary.projects.cljsrn$side_fx.invoke(cljsrn.clj:4)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; spec-tools</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$spec_tools.invokeStatic(chkup.clj:29)
	at canary.projects.chkup$spec_tools.invoke(chkup.clj:28)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; specter</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$specter.invokeStatic(chkup.clj:32)
	at canary.projects.chkup$specter.invoke(chkup.clj:31)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:red'>&#x2717; test-check</b>
```
Exception: clojure.lang.ExceptionInfo: Received unrecognized Travis request state '' {}
	at clojure.core$ex_info.invokeStatic(core.clj:4739)
	at clojure.core$ex_info.invoke(core.clj:4739)
	at canary.runner.utils$ex.invokeStatic(utils.clj:67)
	at canary.runner.utils$ex.doInvoke(utils.clj:64)
	at clojure.lang.RestFn.invoke(RestFn.java:410)
	at canary.runner.travis$determine_request_state.invokeStatic(travis.clj:143)
	at canary.runner.travis$determine_request_state.invoke(travis.clj:133)
	at canary.runner.travis$monitor_request_status_BANG_.invokeStatic(travis.clj:199)
	at canary.runner.travis$monitor_request_status_BANG_.invoke(travis.clj:190)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invokeStatic(travis.clj:230)
	at canary.runner.travis$request_build_and_wait_for_results_BANG_.invoke(travis.clj:227)
	at canary.runner.travis$request_build_BANG_.invokeStatic(travis.clj:245)
	at canary.runner.travis$request_build_BANG_.invoke(travis.clj:240)
	at canary.projects.chkup$test_check.invokeStatic(chkup.clj:35)
	at canary.projects.chkup$test_check.invoke(chkup.clj:34)
	at canary.runner.jobs$execute_task_BANG_.invokeStatic(jobs.clj:25)
	at canary.runner.jobs$execute_task_BANG_.invoke(jobs.clj:21)
	at canary.runner.jobs$try_execute_task_BANG_.invokeStatic(jobs.clj:32)
	at canary.runner.jobs$try_execute_task_BANG_.invoke(jobs.clj:27)
	at canary.runner.jobs$spawn_task_BANG_$fn__10828.invoke(jobs.clj:48)
	at canary.runner.threads$spawn_thread_fn$work__10669.invoke(threads.clj:19)
	at clojure.lang.AFn.run(AFn.java:22)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
---

```

#### <b style='color:green'>&#x2713; chromex</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/chromex#1387](https://travis-ci.org/binaryage/chromex/builds/509786223)<br>

#### <b style='color:green'>&#x2713; cljs-devtools</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-devtools#1051](https://travis-ci.org/binaryage/cljs-devtools/builds/509786230)<br>

#### <b style='color:green'>&#x2713; cljs-oops</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-oops#939](https://travis-ci.org/binaryage/cljs-oops/builds/509786232)<br>

#### <b style='color:green'>&#x2713; cljs-zones</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [binaryage/cljs-zones#573](https://travis-ci.org/binaryage/cljs-zones/builds/509786243)<br>

#### <b style='color:green'>&#x2713; coal-mine</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/coal-mine#1984](https://travis-ci.org/mfikes/coal-mine/builds/509786251)<br>

#### <b style='color:green'>&#x2713; ilk</b>
&nbsp;&nbsp;&nbsp;&nbsp;<b style='color:green'>&#x2713;</b> Travis build [mfikes/ilk#109](https://travis-ci.org/mfikes/ilk/builds/509786310)<br>